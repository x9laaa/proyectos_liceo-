package Programacion_java.ejemplo_pokemon_db;

import java.sql.*;
import java.util.ArrayList;

public class PokemonDao {

     public ArrayList<Pokemon> obtenerPokemones() {

        ArrayList<Pokemon> lista = new ArrayList<>();

        try {
            Connection con = Conexion.conectar();
            String sql = "SELECT * FROM pokemon";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Pokemon p = new Pokemon(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("tipo"),
                        rs.getInt("nivel")
                );

                lista.add(p);
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        return lista;
    }
}