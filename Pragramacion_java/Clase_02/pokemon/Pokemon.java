package Pragramacion_java.Clase_02.pokemon;
public class Pokemon {
    private String nombre;
    private int vida;

    public Pokemon(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void atacar(Pokemon enemigo) {
        int daño = (int) (Math.random() * 20) + 1;
        enemigo.vida -= daño;
        System.out.println(nombre + " atacó a " + enemigo.nombre + " causando " + daño + " puntos de daño.");
    }

    public void mostrarVida() {
        if (vida < 0) {
            vida = 0;
        }
        System.out.println(nombre + " tiene " + vida + " puntos de vida.");
    }   


    
    
}
