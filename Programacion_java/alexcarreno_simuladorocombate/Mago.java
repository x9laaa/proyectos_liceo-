package Programacion_java.alexcarreno_simuladorocombate;

public class Mago extends Personaje{

    public Mago(String nombre) {
        super(nombre, 80);
    }

    @Override
    public int atacar(){
        System.out.println(getNombre()+"lanza un hechizo");
        return 25;
    }
     
}
