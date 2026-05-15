package Programacion_java.Clase_23.ejemplo1;

public class PagoTarjeta implements Pago{
    public void pagar(double m1){
        System.out.println("pangando con tarjeta");
        System.out.println("valor total :"+(m1+m1*0.05));
    }
}
