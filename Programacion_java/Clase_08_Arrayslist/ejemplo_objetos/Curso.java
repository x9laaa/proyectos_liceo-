package Programacion_java.Clase_08_Arrayslist.ejemplo_objetos;
import java.util.ArrayList;

public class Curso {
    private String nombreCurso;
    private String codigoCurso;
    private ArrayList<Alumno> alumnos;

    public Curso(String nombreCurso, String codigoCurso) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.alumnos = new ArrayList<>();
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno) {
        alumnos.remove(alumno);
    }

    public void mostrarAlumnos() {
        System.out.println("Listado de alumnos del curso " + nombreCurso + ":");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre() + ", Edad: " + alumno.getEdad() + ", Promedio: " + alumno.getPromedio());
        }
    }
    public void eliminarAlumnoPorNombre(String nombre) {
        alumnos.removeIf(alumno -> alumno.getNombre().equals(nombre));
        System.out.println("Alumno eliminado: " + nombre);
    }

}
