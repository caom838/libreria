package com.ud.libreria.servicios;

import com.ud.libreria.modelo.Alquiler;

public interface AlquilerServicio extends OperacionService {

		
	Alquiler consultar(Alquiler alquiler);
	
	Boolean registrarAlquiler(Alquiler alquiler);
	
	Boolean editarAlquiler(Alquiler alquiler);
	
}
