package Programacion_java.Clase_21;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona>lista=new ArrayList<>();
        lista.add(new Pablo());
        lista.add(new Gaspar());
        lista.add(new Elmacho());

        for (Persona p : lista) {
            p.atacar(110);
            
        }
    }
}
