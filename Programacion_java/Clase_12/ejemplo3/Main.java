package Programacion_java.Clase_12.ejemplo3;

public class Main {

    public static void main(String[] args) {

        Curso c1 = new Curso("4ºG");
        c1.agregarAlumno(new Alumno("alex", 18, 6.0));
        c1.agregarAlumno(new Alumno("claudio", 16, 4));
        c1.agregarAlumno(new Alumno("benja", 16, 6));

        c1.mostrarLista();
        
    }
    
}
