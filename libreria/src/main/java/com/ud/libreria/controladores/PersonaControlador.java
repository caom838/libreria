package com.ud.libreria.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ud.libreria.modelo.Cliente;
import com.ud.libreria.modelo.Persona;
import com.ud.libreria.servicios.PersonaServicio;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/personas")
public class PersonaControlador {
	
	@Autowired
	PersonaServicio personaServicio;
	
//	@RequestMapping(value = "/persona")
//	public String index() {
//		return "persona";
//	}
	
	  @ResponseBody
	  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  @ApiOperation(value = "Verifies the client's information", tags = "client")
	  public ResponseEntity<Persona> consultarClientes(@PathVariable Long id) {
	    
	    Persona p = new Persona();
	    
	    return ResponseEntity.ok((Persona)personaServicio.getPersona(p));
	  }
	  
	  
	  @ResponseBody
	  @RequestMapping(value = "/all", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	  @ApiOperation(value = "Verifies the client's information", tags = "client")
	  public ResponseEntity<List<Persona>> consultarClientes() {
	    
	    return ResponseEntity.ok((List<Persona>)personaServicio.consultarPersonas());
	  }

}
