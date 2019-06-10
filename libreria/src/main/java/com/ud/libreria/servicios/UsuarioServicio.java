package com.ud.libreria.servicios;

import java.util.List;

import com.ud.libreria.modelo.Privilegio;
import com.ud.libreria.modelo.Rol;
import com.ud.libreria.modelo.Usuario;

public interface UsuarioServicio {

	Usuario get(Usuario usuario);

	Boolean autenticar(Usuario usuario);
	
	List<Rol> consultarRoles();
	
	List<Privilegio> consultarPrivilegios();
}
