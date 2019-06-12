package com.ud.libreria.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud.libreria.modelo.Privilegio;
import com.ud.libreria.modelo.Rol;
import com.ud.libreria.modelo.Usuario;
import com.ud.libreria.repositorio.UsuarioRepository;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{

	@Autowired 
	UsuarioRepository usuarioRepository;
	
	
	@Override
	public Usuario get(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean autenticar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rol> consultarRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Privilegio> consultarPrivilegios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> consultarUsuarios() {
		
		return (List<Usuario>)usuarioRepository.findAll();
	}

}
