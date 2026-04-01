package Programacion_java.Clase_12.ejemplo2;

public class Tripulante {
    private int id;
    private String nombre;
    private String rol;
    private int taresasCompletadas;
    private boolean inspoctor;

    public Tripulante(int id, String nombre, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
        this.taresasCompletadas = 0;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getTaresasCompletadas() {
        return taresasCompletadas;
    }

    public void setTaresasCompletadas(int taresasCompletadas) {
        this.taresasCompletadas = taresasCompletadas;
    }

    public boolean isInspoctor() {
        return inspoctor;
    }

    public void setInspoctor(boolean inspoctor) {
        this.inspoctor = inspoctor;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Rol: " + rol);
        System.out.println("Tareas Completadas: " + taresasCompletadas);

    }

    public void mostrarSiEsInspoctor() {
        if (inspoctor) {
            System.out.println(nombre + " es un impostor.");
        } else {
            System.out.println(nombre + " no es un impostor.");
        }
    }

}