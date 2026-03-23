package Pragramacion_java.Clase_01.ejemplo1;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private int ano;
    private int velocidad;

    public Auto(String marca, String modelo, String color, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ano = ano;
        this.velocidad = 0; // Velocidad inicial
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar() {
        velocidad += 10;
        System.out.println("velocidad aumentada a: " + velocidad + " km/h");
    }

    public void frenar() {
        if (velocidad >= 10) {
            velocidad -= 10;
        } else {
            velocidad = 0; // No puede ser negativa
        }
    }

    public void mostrarVelocidad() {
        System.out.println("Velocidad actual: " + velocidad + " km/h");
    }

}
