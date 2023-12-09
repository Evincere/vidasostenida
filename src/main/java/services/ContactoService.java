package services;

import infrastructure.ContactoRepository;
import models.Contacto;

public class ContactoService {

	private ContactoRepository contactoRepository;

    public ContactoService() {
        this.contactoRepository = new ContactoRepository();
    }

    public void guardarContacto(Contacto contacto) {
        
        contactoRepository.guardarContacto(contacto);
    }
}
