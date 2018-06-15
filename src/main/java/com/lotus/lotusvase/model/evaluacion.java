package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evaluacion")
public class Evaluacion implements Serializable {
	
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "detalle")
	private String detalle;
	@Column(name = "protocolo")
	private String protocolo;
	@Column(name = "tipoEnsayo_id")
	private Long tipoEnsayo_id;
	@Column(name = "solicitante")
	private String solicitante;
	
	
	public Evaluacion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	public String getProtocolo() {
		return protocolo;
	}


	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}


	public Long getTipoEnsayo_id() {
		return tipoEnsayo_id;
	}


	public void setTipoEnsayo_id(Long tipoEnsayo_id) {
		this.tipoEnsayo_id = tipoEnsayo_id;
	}


	public String getSolicitante() {
		return solicitante;
	}


	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}
	

	
	
}
