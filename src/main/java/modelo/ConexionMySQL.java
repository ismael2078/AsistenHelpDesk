package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String BASE_URL = "jdbc:mysql://localhost:3306/";
    private static final String PARAMS = "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String DATABASE = "bd_helpdesk";
    private static final String USER = "root";

    // Intentos de contraseñas habituales (incluye Admin26$ configurada en MySQL Workbench)
    private static final String[] PASSWORDS = {"Admin26$", "", "root", "1234", "123456"};

    public Connection getConexion() {
        Connection conn = null;
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("Driver MySQL no encontrado: " + e.getMessage());
            return null;
        }

        // 1. Probar con base de datos bd_helpdesk y passwords configuradas
        for (String pass : PASSWORDS) {
            try {
                conn = DriverManager.getConnection(BASE_URL + DATABASE + PARAMS, USER, pass);
                if (conn != null) {
                    return conn;
                }
            } catch (SQLException ignored) {
            }
        }

        // 2. Probar con base de datos alternativa 'helpdesk'
        for (String pass : PASSWORDS) {
            try {
                conn = DriverManager.getConnection(BASE_URL + "helpdesk" + PARAMS, USER, pass);
                if (conn != null) {
                    return conn;
                }
            } catch (SQLException ignored) {
            }
        }

        System.err.println("No se pudo conectar a la base de datos MySQL en localhost:3306.");
        return null;
    }
}
