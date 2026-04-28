package Programacion_java.alexcarreno_simuladorocombate;

public class Personaje {
    private String nombre;
    private int vida;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int atacar(){
        System.out.println("ataque basico");
        return 5;
    }

    public void recibirDanio(int danio){
        vida-=danio;
    }

    

    
    
    
}
