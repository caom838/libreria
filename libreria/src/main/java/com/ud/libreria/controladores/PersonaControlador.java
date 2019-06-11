package com.ud.libreria.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ud.libreria.modelo.Cliente;
import com.ud.libreria.modelo.Persona;
import com.ud.libreria.servicios.PersonaServicio;

import io.swagger.annotations.ApiOperation;

@Controller
public class PersonaControlador {
	
	@Autowired
	PersonaServicio personaServicio;
	
	  @ResponseBody
	  @RequestMapping(value = "/api/cliente", method = RequestMethod.GET)
	  @ApiOperation(value = "Verifies the client's information", tags = "client")
	  public ResponseEntity<Cliente> consultarClientes(@PathVariable("id") String id) {
	    Cliente c = new Cliente();
	    Persona p = new Persona();
	    
	    return ResponseEntity.ok((Cliente)personaServicio.getCliente(c));
	  }
	  
	  
	  @ResponseBody
	  @RequestMapping(value = "/api/cliente/all", method = RequestMethod.GET)
	  @ApiOperation(value = "Verifies the client's information", tags = "client")
	  public ResponseEntity<List<Persona>> consultarClientes() {
	    
	    return ResponseEntity.ok((List<Persona>)personaServicio.getAllPersonas());
	  }

}
