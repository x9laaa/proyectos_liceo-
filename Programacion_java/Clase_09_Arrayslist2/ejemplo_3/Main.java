package Programacion_java.Clase_09_Arrayslist2.ejemplo_3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(7);
        notas.add(5);
        notas.add(3);
        notas.add(4);

        System.out.println("Notas: " + notas);

        for (Integer nota : notas) {
            System.out.println("Nota: " + nota);
        }

        notas.remove(2);

        System.out.println("----------");

        for (Integer nota : notas) {
            System.out.println("Nota: " + nota);
        }



    }

}
