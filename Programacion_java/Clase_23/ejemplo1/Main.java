package Programacion_java.Clase_23.ejemplo1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pago> lista = new ArrayList<>();

        lista.add(new PagoTarjeta());
        lista.add(new PagoTraferencia());

        for (Pago i : lista) {
            i.pagar(100);
            
        }
    }
    
}
