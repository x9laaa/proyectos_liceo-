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

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getmarca() {
        return marca;
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
