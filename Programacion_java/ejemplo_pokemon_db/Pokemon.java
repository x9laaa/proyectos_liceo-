package Programacion_java.ejemplo_pokemon_db;

public class Pokemon {

    private int id;
    private String nombre;
    private String tipo;
    private int nivel;

    public Pokemon(int id, String nombre, String tipo, int nivel) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public int getId() {
        return id;
    }
    
} 