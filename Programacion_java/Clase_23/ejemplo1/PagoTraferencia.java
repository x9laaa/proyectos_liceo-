package Programacion_java.Clase_23.ejemplo1;

public class PagoTraferencia implements Pago{

    public void pagar(double m){
        System.out.println("pagando con transferencia");
        System.out.println("valor total: "+(m+m*0.1));
    }
    
}
