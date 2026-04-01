package Programacion_java.Clase_12.ejemplo1;

import java.util.ArrayList;

public class Nave {

    private String nombre;
    private String modelo;
    private int capacidad;
    private ArrayList<Tripulante> tripulantes;

    public Nave(String nombre, String modelo, int capacidad) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.tripulantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Tripulante> getTripulantes() {
        return tripulantes;
    }

    public void agregarTripulante(Tripulante tripulante) {
        if (tripulantes.size() < capacidad) {
            tripulantes.add(tripulante);
        } else {
            System.out.println("No se pueden agregar más tripulantes, capacidad máxima alcanzada.");
        }
    }

    public void mostrarTripulantes() {
        System.out.println("Tripulantes de la nave " + nombre + ":");
        for (Tripulante tripulante : tripulantes) {
            System.out.println("- " + tripulante.getNombre() + " (" + tripulante.getRol() + ")");
        }
    }

    public void expulsarTripulante(String tripulante) {
        for (Tripulante t : tripulantes) {
            if (t.getNombre().equals(tripulante)) {
                tripulantes.remove(t);
                System.out.println("Tripulante " + t.getNombre() + " expulsado de la nave.");
                t.mostrarSiEsInspoctor();
                return;
            }
        }
        System.out.println("El tripulante " + tripulante + " no se encuentra en la nave.");
    }

    public void mostrarInpostores() {
        System.out.println("Tripulantes impostores en la nave " + nombre + ":");
        for (Tripulante tripulante : tripulantes) {
            if (tripulante.isInspoctor()) {
                System.out.println("- " + tripulante.getNombre() + " (" + tripulante.getRol() + ")");
            }
        }
    }

    void cantidadTripulantes() {
        System.out.println("Cantidad de tripulantes en la nave " + nombre + ": " + tripulantes.size());
    }


    
}
