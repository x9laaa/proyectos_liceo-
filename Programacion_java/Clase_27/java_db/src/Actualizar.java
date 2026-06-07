import java.sql.Connection;
import java.sql.Statement;

public class Actualizar {
    public static void actualizar(int id, String nombre, int edad) {
        Connection cn = Conexion.conectar();

        String sql = "UPDATE alumnos SET nombre = '" + nombre + "', edad = " + edad + " WHERE id = " + id;
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
