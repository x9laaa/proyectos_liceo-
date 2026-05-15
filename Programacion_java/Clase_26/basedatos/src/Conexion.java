import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public static Connection conectar() {

        Connection conexion = null;

        try {

            String url = "jdbc:mysql://localhost:3306/test";
            String usuario = "alex";
            String contraseña = "labcode2026";

            conexion = DriverManager.getConnection(url, usuario, contraseña);

            System.out.println("Conexión exitosa");

        } catch (Exception e) {

            System.out.println("Error de conexión");
            System.out.println(e.getMessage());

        }

        return conexion;
    }
}