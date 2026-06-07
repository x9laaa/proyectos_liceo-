import java.sql.Connection;
import java.sql.Statement;

public class Insertar {
    public static void insertar(String nombre, int edad) {
        Connection cn = Conexion.conectar();
        String sql = "INSERT INTO alumnos (nombre, edad) VALUES ('" + nombre + "', " + edad + ")";
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
