package Programacion_java.Clase_02.pokemon;
import java.lang.Thread;
public class Main {
    public static void main(String[] args) {
        
        Pokemon pikachu = new Pokemon("Pikachu", 120);
        Pokemon charmander = new Pokemon("Charmander", 100);

        pikachu.mostrarInfo();
        charmander.mostrarInfo();

        while (pikachu.estaVivo() && charmander.estaVivo()) {
            System.out.println("-----------------------------");     
            System.out.println("\nTurno de " + pikachu.getNombre());
            pikachu.atacar(charmander);
            if (!charmander.estaVivo()) {
                System.out.println(charmander.getNombre() + " ha sido derrotado!");
                charmander.mostrarVida();
                break;
            }

            charmander.atacar(pikachu);
            System.out.println("\nTurno de " + charmander.getNombre());
            if (!pikachu.estaVivo()) {
                System.out.println(pikachu.getNombre() + " ha sido derrotado!");
                pikachu.mostrarVida();
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
