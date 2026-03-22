import sys
import random
from PyQt5.QtWidgets import (
    QApplication, QWidget, QLabel, QVBoxLayout,
    QPushButton, QHBoxLayout, QFrame
)
from PyQt5.QtCore import QTimer
from PyQt5.QtGui import QFont

from matplotlib.backends.backend_qt5agg import FigureCanvasQTAgg as FigureCanvas
from matplotlib.figure import Figure


class Dashboard(QWidget):
    def __init__(self):
        super().__init__()

        self.setWindowTitle("Dashboard Clima - Coltauco")
        self.setGeometry(100, 100, 800, 500)

        # Datos simulados
        self.temperaturas = []
        self.humedades = []

        # Layout principal
        main_layout = QVBoxLayout()

        # Título
        titulo = QLabel("Clima en Coltauco 🌤️")
        titulo.setFont(QFont("Arial", 18))
        main_layout.addWidget(titulo)

        # Layout de tarjetas
        cards_layout = QHBoxLayout()

        # Crear cards correctamente (FIX aplicado)
        frame_temp, self.temp_label = self.crear_card("Temperatura", "0 °C")
        frame_hum, self.hum_label = self.crear_card("Humedad", "0 %")
        frame_estado, self.estado_label = self.crear_card("Estado", "Despejado")

        cards_layout.addWidget(frame_temp)
        cards_layout.addWidget(frame_hum)
        cards_layout.addWidget(frame_estado)

        main_layout.addLayout(cards_layout)

        # Gráfico
        self.fig = Figure()
        self.canvas = FigureCanvas(self.fig)
        main_layout.addWidget(self.canvas)

        # Botón actualizar
        boton = QPushButton("Actualizar datos")
        boton.clicked.connect(self.actualizar_datos)
        main_layout.addWidget(boton)

        self.setLayout(main_layout)

        # Timer automático
        self.timer = QTimer()
        self.timer.timeout.connect(self.actualizar_datos)
        self.timer.start(3000)  # cada 3 segundos

        # Estilo moderno
        self.setStyleSheet("""
            QWidget {
                background-color: #1e1e1e;
                color: white;
                font-size: 14px;
            }
            QFrame {
                background-color: #2b2b2b;
                border-radius: 10px;
                padding: 10px;
            }
            QPushButton {
                background-color: #3a86ff;
                padding: 10px;
                border-radius: 8px;
            }
            QPushButton:hover {
                background-color: #265dbe;
            }
        """)

    def crear_card(self, titulo, valor):
        frame = QFrame()
        layout = QVBoxLayout()

        label_titulo = QLabel(titulo)
        label_valor = QLabel(valor)
        label_valor.setFont(QFont("Arial", 16))

        layout.addWidget(label_titulo)
        layout.addWidget(label_valor)

        frame.setLayout(layout)

        return frame, label_valor  # 🔥 IMPORTANTE

    def actualizar_datos(self):
        temp = random.randint(10, 30)
        hum = random.randint(40, 90)
        estado = random.choice(["Soleado ☀️", "Nublado ☁️", "Lluvioso 🌧️"])

        # Actualizar UI
        self.temp_label.setText(f"{temp} °C")
        self.hum_label.setText(f"{hum} %")
        self.estado_label.setText(estado)

        # Guardar datos
        self.temperaturas.append(temp)
        self.humedades.append(hum)

        if len(self.temperaturas) > 10:
            self.temperaturas.pop(0)
            self.humedades.pop(0)

        self.actualizar_grafico()

    def actualizar_grafico(self):
        self.fig.clear()
        ax = self.fig.add_subplot(111)

        ax.plot(self.temperaturas, label="Temperatura")
        ax.plot(self.humedades, label="Humedad")

        ax.legend()
        ax.set_title("Evolución del clima")

        self.canvas.draw()


# Ejecutar aplicación
if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = Dashboard()
    window.show()
    sys.exit(app.exec_())