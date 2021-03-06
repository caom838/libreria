package com.ud.libreria.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.ud.libreria.modelo.Persona;


public interface PersonaRepository extends  CrudRepository<Persona, Long> {

	Persona getByPersona(Persona persona);
	
	Persona getByTipoIdentificadorAndIdentificador(String tipoIdentificador, String identificador);
	

}
