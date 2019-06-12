package com.ud.libreria.servicios;

import java.util.List;
import java.util.Optional;

import com.ud.libreria.modelo.Persona;
import com.ud.libreria.modelo.Venta;

public interface VentaServicio extends OperacionService {

	Optional<Venta> consultar(Venta venta);
		
	Boolean registrarVenta(Venta venta);
	
	Boolean editarVenta(Venta venta);
	
	List<Venta> consultarVentas();
	
	Optional<Venta> consultarPorPersona(Persona persona);
}
