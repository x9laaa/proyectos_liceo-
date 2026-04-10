import yt_dlp

def descargar_mejor_calidad(url):
    opciones = {
        'format': 'bestvideo+bestaudio/best',
        'merge_output_format': 'mp4',
        'outtmpl': '%(title)s.%(ext)s'
    }

    with yt_dlp.YoutubeDL(opciones) as ydl:
        ydl.download([url])

if __name__ == "__main__":
    url = input("🔗 Ingresa la URL del video de YouTube: ")
    print("⬇️ Descargando la mejor calidad disponible...")
    descargar_mejor_calidad(url)
    print("✅ Descarga completada.")