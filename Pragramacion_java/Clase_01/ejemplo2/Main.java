public class Main {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Pikachu", 100);
        Pokemon p2 = new Pokemon("Charmander", 100);

        p1.mostrarInformacion();
        p2.mostrarInformacion();

        while (p1.getVida() > 0 && p2.getVida() > 0) {

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("\n--- Nueva ronda de ataque ---");
            p1.mostrarVida();
            p2.mostrarVida();
            p1.atacar(p2);

            if (p2.getVida() > 0) {
                p2.atacar(p1);
            }

            System.out.println("--- Terminó la ronda ---");

            try {
                Thread.sleep(2000); // Pausa por 2000 milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("\n--- Resultado final ---");
        p1.mostrarVida();
        p2.mostrarVida();
        if (p1.getVida() > 0) {
            System.out.println(p1.getNombre() + " gana la batalla!");
        } else if (p2.getVida() > 0) {
            System.out.println(p2.getNombre() + " gana la batalla!");
        } else {
            System.out.println("¡Es un empate!");
        }

    }

}
