package com.ud.libreria.modelo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;

import lombok.Data;


/**
 * @author shrek
 * @version 1.0
 * @created 28-may.-2019 10:39:41 p. m.
 */
@Data
@Entity
@NamedQuery(name="Tarjetacredito.findAll", query="SELECT t FROM Tarjetacredito t")
public class TarjetaCredito implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private @Id @GeneratedValue Long id;

	@Column(name="codigo_cvv")
	private String codigoCvv;

	@Column(name="fecha_expiracion")
	private Timestamp fechaExpiracion;

	@Column(name="numero_tarjeta")
	private String numeroTarjeta;

	@Column(name="tarjeta_habiente")
	private String tarjetaHabiente;


	//bi-directional many-to-many association to Persona
	@ManyToMany
	@JoinTable(
		name="tarjetacreditopersona"
		, joinColumns={
			@JoinColumn(name="id_tarjeta")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_persona")
			}
		)
	private List<Persona> personas;
	
	




	public void finalize() throws Throwable {
		super.finalize();
	}
	public TarjetaCredito(){

	}

	public boolean esValida(){
		return false;
	}

	public String getFechaExpiracion(){
		return "";
	}

	public String getNumeroTarjeta(){
		return "";
	}
}//end TarjetaCredito