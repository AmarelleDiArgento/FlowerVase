package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="asignaCar")
public class AsignaCar implements Serializable{
	@Column(name="etaId")
	private int etaId;
	@Column(name="carId")
	private int carId;

	public AsignaCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEtaId() {
		return etaId;
	}

	public void setEtaId(int etaId) {
		this.etaId = etaId;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}
	

}
