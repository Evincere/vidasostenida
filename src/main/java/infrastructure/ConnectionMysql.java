package infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMysql {

	private static final String URL = "jdbc:mysql://localhost:3306/vidasostenidabd";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("¡Conexión establecida!");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return con;
    }
}
