package com.ud.libreria.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud.libreria.modelo.Alquiler;
import com.ud.libreria.modelo.Persona;
import com.ud.libreria.modelo.Venta;
import com.ud.libreria.repositorio.AlquilerRepository;

@Service
public class AlquilerServicioImpl implements AlquilerServicio {

	@Autowired
	AlquilerRepository alquilerRepository;
	
	@Override
	public Double calcularTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Alquiler> consultar(Alquiler alquiler) {
		return alquilerRepository.findById(alquiler.getId());
	}

	@Override
	public Boolean registrarAlquiler(Alquiler alquiler) {
		Alquiler a =alquilerRepository.save(alquiler);
		return a!=null?true:false;
	}

	@Override
	public Boolean editarAlquiler(Alquiler alquiler) {
		Alquiler a =alquilerRepository.save(alquiler);
		return a!=null?true:false;
	}

	@Override
	public List<Alquiler> consultarAlquileres() {

		return (List<Alquiler>)alquilerRepository.findAll();
	}
	

}
