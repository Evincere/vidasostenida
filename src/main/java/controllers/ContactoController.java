package controllers;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import infrastructure.ConnectionMysql;
import models.Contacto;
import services.ContactoService;


public class ContactoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Contacto contacto;
	 private ContactoService contactoService;
	
	public ContactoController() {
		this.contactoService = new ContactoService();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = request.getParameter("nombre-data");
		String email = request.getParameter("email-data");
		String mensaje = request.getParameter("mensaje-data");

		contacto = new Contacto(nombre, email, mensaje);
		
		
		contactoService.guardarContacto(contacto);
		
		
		response.sendRedirect("pages/pagina-de-confirmacion.html");
	}

}
