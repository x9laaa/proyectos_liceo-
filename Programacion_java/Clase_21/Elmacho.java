package Programacion_java.Clase_21;

public class Elmacho extends Persona{
    @Override
    public void atacar(int valor){
        double golpe_tun_tun = valor * 0.9;
        System.out.println("el golpe de la clase elmacho: " + golpe_tun_tun);
    }
    
}
