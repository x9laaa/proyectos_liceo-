import os
import uuid
from flask import Flask, render_template, request, redirect, url_for, send_file, session, after_this_request
import yt_dlp

app = Flask(__name__)
app.secret_key = 'clave_super_secreta'
DOWNLOAD_FOLDER = "downloads"
os.makedirs(DOWNLOAD_FOLDER, exist_ok=True)

@app.route('/', methods=['GET', 'POST'])
def index():
    if request.method == 'POST':
        url = request.form['url']
        session['url'] = url

        # Extraer metadatos
        with yt_dlp.YoutubeDL({'quiet': True}) as ydl:
            info = ydl.extract_info(url, download=False)
            session['video_info'] = {
                'title': info.get('title', 'video'),
                'duration': info.get('duration', 0),
                'uploader': info.get('uploader', 'Canal desconocido'),
                'thumbnail': info.get('thumbnail', '')
            }

        return redirect(url_for('opciones'))

    return render_template('index.html')

@app.route('/opciones', methods=['GET', 'POST'])
def opciones():
    video_info = session.get('video_info')
    url = session.get('url')

    if not video_info or not url:
        return redirect(url_for('index'))

    if request.method == 'POST':
        formato = request.form['formato']
        nombre = request.form['nombre']

        filename = f"{uuid.uuid4().hex}.{formato}"
        output_path = os.path.join(DOWNLOAD_FOLDER, filename)

        ydl_opts = {
            'format': 'bestvideo+bestaudio/best',
            'merge_output_format': formato,
            'outtmpl': output_path,
            'quiet': True
        }

        with yt_dlp.YoutubeDL(ydl_opts) as ydl:
            ydl.download([url])

        session['download_file'] = output_path
        session['final_name'] = f"{nombre}.{formato}"

        return redirect(url_for('descargado'))

    return render_template('opciones.html', video=video_info)

@app.route('/descargado', methods=['GET', 'POST'])
def descargado():
    if request.method == 'POST':
        output_path = session.get('download_file')
        final_name = session.get('final_name')

        if not output_path or not os.path.exists(output_path):
            return "Archivo no encontrado", 404

        @after_this_request
        def remove_file(response):
            try:
                os.remove(output_path)
            except Exception as e:
                print(f"Error al borrar archivo: {e}")
            return response

        return send_file(output_path, as_attachment=True, download_name=final_name)

    return render_template('descargado.html')

if __name__ == "__main__":
    app.run(debug=True)
