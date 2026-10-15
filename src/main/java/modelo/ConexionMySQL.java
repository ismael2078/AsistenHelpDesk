package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String BASE_URL = "jdbc:mysql://localhost:3306/";
    private static final String PARAMS = "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USER = "root";

    private static final String[] DATABASES = {"bd_helpdesk", "helpdesk_hospital", "helpdesk"};
    private static final String[] PASSWORDS = {"Admin26$", "", "root", "1234", "123456"};

    public Connection getConexion() {
        Connection conn = null;
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("Driver MySQL no encontrado: " + e.getMessage());
            return null;
        }

        for (String db : DATABASES) {
            for (String pass : PASSWORDS) {
                try {
                    conn = DriverManager.getConnection(BASE_URL + db + PARAMS, USER, pass);
                    if (conn != null) {
                        return conn;
                    }
                } catch (SQLException ignored) {
                }
            }
        }

        System.err.println("No se pudo conectar a la base de datos MySQL en localhost:3306.");
        return null;
    }
}
