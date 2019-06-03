package com.ud.libreria.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.ud.libreria.modelo.Alquiler;

public interface AlquilerRepository extends CrudRepository<Alquiler, Long> {

}
