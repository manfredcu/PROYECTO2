

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {

    Connection con = null;
    private final String url = "jdbc:mysql://localhost/de_ferreteria";

    public conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
            if (con != null) {
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "No se pudo establecer conexión con la base de datos" + url,
                    "Conectado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Connection conectado() {
        return con;
    }

    public void desconectar() {
        con = null;
    }
}
