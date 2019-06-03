package com.ud.libreria.libreria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ud.libreria.modelo.Persona;
import com.ud.libreria.repositorio.PersonaRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

//	protected PersonaRepository repository;
//
//	@Autowired
//	public DatabaseLoader(PersonaRepository prepository) {
//		this.repository = prepository;
//	}

	@Override
	public void run(String... strings) throws Exception {
		Persona p =new Persona();
		
		//this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
	}
}
