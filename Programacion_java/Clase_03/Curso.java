package Programacion_java.Clase_03;
public class Curso {

    private String nombreCurso;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public String bailar(){
        return "este curso esta bailando";
    }
    
}