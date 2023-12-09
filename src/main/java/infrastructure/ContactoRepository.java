package infrastructure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.Contacto;

public class ContactoRepository {

	 private Connection conexionBd;

	    public ContactoRepository() {
	        conexionBd = ConnectionMysql.getConnection();
	    }

	    public void guardarContacto(Contacto contacto) {
	        try {
	            String sql = "INSERT INTO contactos (nombre, email, mensaje) VALUES (?, ?, ?)";
	            PreparedStatement statement = conexionBd.prepareStatement(sql);
	            statement.setString(1, contacto.getNombre());
	            statement.setString(2, contacto.getEmail());
	            statement.setString(3, contacto.getMensaje());
	            statement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
