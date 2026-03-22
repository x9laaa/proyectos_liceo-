import sys
from PyQt5.QtWidgets import QApplication, QWidget, QVBoxLayout, QGridLayout, QLineEdit, QPushButton
from PyQt5.QtGui import QFont

class Calculadora(QWidget):
    def __init__(self):
        super().__init__()

        self.setWindowTitle("Calculadora")
        self.setGeometry(100, 100, 300, 400)

        # Layout principal
        layout = QVBoxLayout()

        # Pantalla
        self.pantalla = QLineEdit()
        self.pantalla.setFont(QFont("Arial", 20))
        self.pantalla.setReadOnly(True)
        self.pantalla.setFixedHeight(50)
        layout.addWidget(self.pantalla)

        # Layout de botones
        grid = QGridLayout()

        botones = [
            ('7', 0, 0), ('8', 0, 1), ('9', 0, 2), ('/', 0, 3),
            ('4', 1, 0), ('5', 1, 1), ('6', 1, 2), ('*', 1, 3),
            ('1', 2, 0), ('2', 2, 1), ('3', 2, 2), ('-', 2, 3),
            ('0', 3, 0), ('C', 3, 1), ('=', 3, 2), ('+', 3, 3),
        ]

        for texto, fila, columna in botones:
            boton = QPushButton(texto)
            boton.setFont(QFont("Arial", 14))
            boton.setFixedSize(60, 60)
            boton.clicked.connect(self.click_boton)
            grid.addWidget(boton, fila, columna)

        layout.addLayout(grid)
        self.setLayout(layout)

        # Estilo moderno
        self.setStyleSheet("""
            QWidget {
                background-color: #1e1e1e;
            }
            QLineEdit {
                background-color: #2b2b2b;
                color: white;
                border-radius: 8px;
                padding: 10px;
            }
            QPushButton {
                background-color: #3a86ff;
                color: white;
                border-radius: 8px;
            }
            QPushButton:hover {
                background-color: #265dbe;
            }
        """)

    def click_boton(self):
        boton = self.sender()
        texto = boton.text()

        if texto == "C":
            self.pantalla.clear()

        elif texto == "=":
            try:
                resultado = eval(self.pantalla.text())
                self.pantalla.setText(str(resultado))
            except:
                self.pantalla.setText("Error")

        else:
            self.pantalla.setText(self.pantalla.text() + texto)


if __name__ == "__main__":
    app = QApplication(sys.argv)
    ventana = Calculadora()
    ventana.show()
    sys.exit(app.exec_())