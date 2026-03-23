package Programacion_java.ejemplo_pokemon_db;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PokemonDao dao = new PokemonDao();

        ArrayList<Pokemon> pokemones = new ArrayList<>();
        for (Pokemon p : dao.obtenerPokemones()) {
            pokemones.add(p);
        }



        System.out.println("Pokemones en la base de datos:");

        for (Pokemon p : pokemones) {
            System.out.println(p.getId() + " - " + p.getNombre() + " - " + p.getTipo() + " - " + p.getNivel());
        }

        System.out.println("\nAgregando un nuevo pokemon...");
        pokemones.add(new Pokemon(pokemones.size() + 1, "Pikachu", "Eléctrico", 25));

        System.out.println("\nPokemones actualizados:");
        for (Pokemon p : pokemones) {
            System.out.println(p.getId() + " - " + p.getNombre() + " - " + p.getTipo() + " - " + p.getNivel());
        }
    }
}