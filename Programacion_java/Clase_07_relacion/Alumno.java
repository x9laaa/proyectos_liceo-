package Programacion_java.Clase_07_relacion;
public class Alumno {
    private String nombre;
    private Curso curso;

    public Alumno(String nombre, Curso curso) {
        this.nombre = nombre;
        this.curso = curso;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre del alumno: " + nombre);
        System.out.println("Curso: " + curso.getNombre());
        System.out.println("Profesor: " + curso.getProfesor().getNombre());
    }
    
}
