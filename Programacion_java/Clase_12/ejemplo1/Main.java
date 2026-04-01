package Programacion_java.Clase_12.ejemplo1;

public class Main {
    public static void main(String[] args) {
        Nave nave1 = new Nave("Enterprise", "NCC-1701", 5);
        nave1.agregarTripulante(new Tripulante(1, "James T. Kirk", "Capitán"));
        nave1.agregarTripulante(new Tripulante(2, "Spock", "Oficial Científico"));
        nave1.agregarTripulante(new Tripulante(3, "Leonard McCoy", "Oficial Médico"));
        nave1.agregarTripulante(new Tripulante(4, "Montgomery Scott", "Jefe de Ingeniería"));
        nave1.agregarTripulante(new Tripulante(5, "Nyota Uhura", "Oficial de Comunicaciones"));
        nave1.mostrarTripulantes();
        nave1.mostrarInpostores();

        nave1.cantidadTripulantes();

        nave1.expulsarTripulante("Spock");


    }

}
