package com.ud.libreria.servicios;

import java.util.List;
import java.util.Optional;

import com.ud.libreria.modelo.Alquiler;

public interface AlquilerServicio extends OperacionService {

		
	Optional<Alquiler> consultar(Alquiler alquiler);
	
	Boolean registrarAlquiler(Alquiler alquiler);
	
	Boolean editarAlquiler(Alquiler alquiler);
	
	List<Alquiler> consultarAlquileres();
	
}
