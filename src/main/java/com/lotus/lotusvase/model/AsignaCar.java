package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="asignaCar")
public class AsignaCar implements Serializable{
	@Column(name="etaId")
	private Long etaId;
	@Column(name="carId")
	private Long carId;

	public AsignaCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getEtaId() {
		return etaId;
	}

	public void setEtaId(Long etaId) {
		this.etaId = etaId;
	}

	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}
	

}
