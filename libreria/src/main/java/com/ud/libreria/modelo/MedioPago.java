package com.ud.libreria.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * @author shrek
 * @version 1.0
 * @created 28-may.-2019 10:39:40 p. m.
 */
@Entity
@NamedQuery(name="Mediopago.findAll", query="SELECT m FROM Mediopago m")
public class MedioPago implements Serializable {
	private static final long serialVersionUID = 1L;

	private @Id @GeneratedValue Long id;
	private boolean estado;
	private String nombre;

	//bi-directional many-to-one association to Tarjetacredito
	@OneToMany(mappedBy="mediopago")
	private List<TarjetaCredito> tarjetacreditos;


	public void finalize() throws Throwable {

	}
	public MedioPago(){

	}

	public String getNombre(){
		return "";
	}
}//end MedioPago