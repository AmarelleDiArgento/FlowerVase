package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="nota")
public class Nota implements Serializable{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "detalle")
	private  String detalle;
	@Column(name="etaId")
	private int etaId;
	@Column(name="tratId")
	private int tratId;

	public Nota() {
		// TODO Auto-generated constructor stub
	}

	public Nota(String tipo, String detalle, int etaId, int tratId) {
		super();
		this.tipo = tipo;
		this.detalle = detalle;
		this.etaId = etaId;
		this.tratId = tratId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getEtaId() {
		return etaId;
	}

	public void setEtaId(int etaId) {
		this.etaId = etaId;
	}

	public int getTratId() {
		return tratId;
	}

	public void setTratId(int tratId) {
		this.tratId = tratId;
	}
	

}
