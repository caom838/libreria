package com.ud.libreria.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
@NamedQuery(name="Alquiler.findAll", query="SELECT a FROM Alquiler a")
public class Alquiler extends Operacion implements Serializable {
	private static final long serialVersionUID = 1L;



	
	@Id
	@GeneratedValue
	private Long id;

	private String comentarios;

	private Date fecha;
	
	/**
	 * Fecha calculada de entrega o devoluci�n de un item por alquiler
	 */
	@Column(name="fecha_entrega")
	private Date fechaEntrega;

	/**
	 * Es la fecha real que se entreg� o devolvi� el item por alquiler
	 */
	@Column(name="fecha_real_entrega")
	private Date fechaRealEntrega;

	private BigDecimal valor;

	//bi-directional many-to-one association to Mediopago
	@ManyToOne
	@JoinColumn(name="id_mediopago")
	private MedioPago mediopago;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="id_persona")
	private Persona persona;

	//bi-directional many-to-many association to Item
	@ManyToMany(mappedBy="alquilers")
	private List<Item> items;
	

	public Alquiler(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public Double calcularTotal(){
		return 0.0;
	}
}//end Alquiler