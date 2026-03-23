package Pragramacion_java.Clase_01.ejemplo2;
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

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
    }

    public void atacar(Pokemon enemigo) {
        int danio = (int) (Math.random() * 20) + 1; // Daño aleatorio entre 1 y 20
        System.out.println(nombre + " ataca a " + enemigo.getNombre() + " causando " + danio + " de daño.");
        enemigo.setVida(enemigo.vida - danio);
    }

    public void estado() {
        if (vida > 0) {
            System.out.println(nombre + " está vivo con " + vida + " de vida.");
        } else {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }

    public void curar(int cantidad) {
        vida += cantidad;
        System.out.println(nombre + " se cura y ahora tiene " + vida + " de vida.");
    }

    public void mostrarVida() {
        int maxVida = 100; // vida máxima aproximada
        int barras = 10;
        if (vida < 0) {
            vida = 0;
        }
        int llenas = (vida * barras) / maxVida;
        System.out.print(nombre + ": ");
        for (int i = 0; i < llenas; i++) {
            System.out.print("|");
        }
        for (int i = llenas; i < barras; i++) {
            System.out.print(" ");
        }

        System.out.println(" " + vida + " HP");
    }

}
