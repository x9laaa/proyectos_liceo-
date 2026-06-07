import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consultar {
    public static void consultar() {
        Connection cn = Conexion.conectar();
        try {
            String sql = "SELECT * FROM alumnos";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println("-------------------");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Edad: " + rs.getInt("edad"));
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
