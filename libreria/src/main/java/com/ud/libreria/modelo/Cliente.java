package com.ud.libreria.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import lombok.Data;

/**
 * @author shrek
 * @version 1.0
 * @created 28-may.-2019 10:39:36 p. m.
 */
@Data
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente extends Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(name="direccion_facturacion")
	private String direccionFacturacion;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="id_persona")
	private Persona persona;



	public void finalize() throws Throwable {
		super.finalize();
	}
	public Cliente(){

	}
}//end Cliente