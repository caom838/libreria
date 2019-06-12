package com.ud.libreria.repositorio;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ud.libreria.modelo.Persona;
import com.ud.libreria.modelo.Venta;

public interface VentaRepository extends CrudRepository<Venta, Long> {
	
	Optional<Venta> findByPersona(Persona persona);

}
