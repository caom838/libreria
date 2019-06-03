package com.ud.libreria.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.ud.libreria.modelo.Usuario;

public interface UsuarioRepository  extends CrudRepository<Usuario, Long> { 

}
