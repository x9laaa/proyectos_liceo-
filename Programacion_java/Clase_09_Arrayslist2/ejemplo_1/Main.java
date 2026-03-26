package Programacion_java.Clase_09_Arrayslist2.ejemplo_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaCurso = new ArrayList<>();

        listaCurso.add("pedro");
        listaCurso.add("maría");
        listaCurso.add("juan");
        listaCurso.add("ana");
        listaCurso.add("luis");
        listaCurso.add("juana");
        System.out.println("Lista de estudiantes: ");
        for (String nombre : listaCurso) {
            System.out.println("- " + nombre);            
        }

        listaCurso.remove("juan");
        System.out.println("\nLista de estudiantes después de eliminar a juan: ");
        for (String nombre : listaCurso) {
            System.out.println("- " + nombre);      

        }

    }
    
}
