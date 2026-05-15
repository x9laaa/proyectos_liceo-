import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        try {

            Connection conn = Conexion.conectar();

            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM usuarios";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                System.out.println(
                        rs.getString("nombre"));
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}
