package Programacion_java.Clase_12.ejemplo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Nave nave1 = new Nave("Enterprise", "NCC-1701", 5);
        nave1.agregarTripulante(new Tripulante(1, "James", "Capitán"));
        nave1.agregarTripulante(new Tripulante(2, "Spock", "Oficial Científico"));
        nave1.agregarTripulante(new Tripulante(3, "Leonard", "Oficial Médico"));
        nave1.agregarTripulante(new Tripulante(4, "Montgomery", "Jefe de Ingeniería"));
        nave1.agregarTripulante(new Tripulante(5, "Nyota", "Oficial de Comunicaciones"));

        nave1.mostrarInpostores();
        nave1.asignarImpostor();

        int vidas = 3;
        while (vidas > 0) {
            System.out.println("Vidas : " + vidas);
            nave1.mostrarTripulantes();
            System.out.println("ingresa el nombre del tripulante que deseas eliminar:");
            String nombre = scanner.nextLine();

            if (!nave1.verificarTripulante(nombre)) {
                nave1.expulsarTripulante(nombre);
                System.out.println("Has eliminado a un tripulante inocente. Pierdes una vida.");
                vidas--;
            } else {
                System.out.println("Has eliminado a un impostor. ¡Bien hecho!");
                System.out.println("¡Has ganado el juego! con " + vidas + " vidas restantes.");
                break;

            }

        }
            if (vidas == 0) {
                System.out.println("Has perdido el juego. Todos los tripulantes han sido eliminados.");
            } 

            System.out.println("Gracias por jugar. ¡Hasta la próxima!");
            System.out.println("Desarrollado por: Alex CarreñoSpo");
            scanner.close();
    

    }

}
