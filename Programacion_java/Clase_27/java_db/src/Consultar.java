import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consultar {

    public static ResultSet consultar() {
        Connection cn = Conexion.conectar();

        String sql = "SELECT * FROM alumnos";
        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
