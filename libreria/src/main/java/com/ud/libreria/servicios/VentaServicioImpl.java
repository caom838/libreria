package com.ud.libreria.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud.libreria.modelo.Persona;
import com.ud.libreria.modelo.Venta;
import com.ud.libreria.repositorio.VentaRepository;

@Service
public class VentaServicioImpl implements VentaServicio {

	@Autowired
	VentaRepository ventaRepository;
	
	@Override
	public Double calcularTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Venta> consultar(Venta venta) {
		return ventaRepository.findById(venta.getId());
	}

	@Override
	public Boolean registrarVenta(Venta venta) {
		Venta v =ventaRepository.save(venta);
		return v!=null?true:false;
	}

	@Override
	public Boolean editarVenta(Venta venta) {

		Venta v =ventaRepository.save(venta);
		return v!=null?true:false;
	}

	
	@Override
	public List<Venta> consultarVentas() {
		return (List<Venta>)ventaRepository.findAll();
	}

	@Override
	public Optional<Venta> consultarPorPersona(Persona persona) {
		return ventaRepository.findByPersona(persona);
	}
}
