package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ramo")
public class Ramo implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	@Column(name = "EtaId")
	private int EtaId;
	@Column(name = "traId")
	private int traId;
	@Column(name = "observacion")
	private String observacion;
	
	public Ramo() {
		// TODO Auto-generated constructor stub
	}

	public Ramo(int etaId, int traId, String observacion) {
		super();
		EtaId = etaId;
		this.traId = traId;
		this.observacion = observacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getEtaId() {
		return EtaId;
	}

	public void setEtaId(int etaId) {
		EtaId = etaId;
	}

	public int getTraId() {
		return traId;
	}

	public void setTraId(int traId) {
		this.traId = traId;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
