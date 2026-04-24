package Programacion_java.Clase_21;

public class Pablo extends Persona {
    @Override
     public void atacar(int valor){
        double golpe_tun_tun = valor * 0.5;
        System.out.println("el golpe de la clase pablo: " + golpe_tun_tun);
    }

}
