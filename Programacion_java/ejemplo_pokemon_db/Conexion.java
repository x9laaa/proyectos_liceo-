package Programacion_java.ejemplo_pokemon_db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection conectar() {
        try {
            String url = "jdbc:mysql://localhost:3306/pokemon_db";
            String user = "alex";
            String password = "q1w2e3r4";

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado correctamente");
            return con;

        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}
