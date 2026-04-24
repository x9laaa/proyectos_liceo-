package Programacion_java.Clase_21;

public class Gaspar extends Persona{
    @Override 
    public void atacar(int valor){
    double golpe_tun_tun = valor * 0.1;
        System.out.println("el golpe de la clase gaspar: " + golpe_tun_tun);
    }
}
