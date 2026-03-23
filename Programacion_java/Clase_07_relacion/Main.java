package Programacion_java.Clase_07_relacion;
public class Main {
    public static void main(String[] args) {
        
        Profesor p1 = new Profesor("Alex Carreño");
        
        Curso c1 = new Curso("Programación", p1);

        Alumno alumno = new Alumno("Juan Pérez", c1);
        
        alumno.mostrarInformacion();
    }
}
