package com.ud.libreria.servicios;

import com.ud.libreria.modelo.Venta;

public interface VentaServicio extends OperacionService {

	Venta consultar(Venta venta);
		
	Boolean registrarVenta(Venta venta);
	
	Boolean editarVenta(Venta venta);
}
