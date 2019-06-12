package com.ud.libreria.servicios;

import java.util.List;

import com.ud.libreria.modelo.Persona;

public interface PersonaServicio {

	Persona getPersona(Persona persona);
	Persona getCliente(Persona cliente);
	Persona getEmpleado(Persona empleado);
	List<Persona> consultarPersonas();
}
