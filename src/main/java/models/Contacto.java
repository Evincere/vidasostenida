package models;

public class Contacto {
	
	private String nombre;
	private String email;
	private String mensaje;
	
	
	public Contacto(String nombre, String email, String mensaje) {
		this.nombre = nombre;
		this.email = email;
		this.mensaje = mensaje;
	}


	public String getNombre() {
		return nombre;
	}


	public String getEmail() {
		return email;
	}


	public String getMensaje() {
		return mensaje;
	}
	
	

}
