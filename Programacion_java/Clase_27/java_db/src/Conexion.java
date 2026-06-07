import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection conectar() {
        Connection conexion = null;
        try {
            String url = "jdbc:mysql://localhost:3306/colegio";
            String usuario = "alex";
            String contraseña = "labcode";
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            
        } catch (Exception e) {
            System.out.println("Error de conexión");
            System.out.println(e.getMessage());
        }
        return conexion;
    }
}