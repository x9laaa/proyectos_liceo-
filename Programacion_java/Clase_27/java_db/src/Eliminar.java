import java.sql.Connection;
import java.sql.Statement;

public class Eliminar {
    public static void eliminar(int id) {
        Connection cn = Conexion.conectar();

        String sql = "DELETE FROM alumnos WHERE id = " + id;
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
    