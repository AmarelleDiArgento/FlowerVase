package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="adicionales")
public class Adicionales implements Serializable{
	
	@Column(name="carId")
	private Long carId;
	@Column(name="lecId")
	private Long lecId;
	@Column(name="valor")
	private double valor;
	
	public Adicionales() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	public Long getLecId() {
		return lecId;
	}

	public void setLecId(Long lecId) {
		this.lecId = lecId;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double dato) {
		this.valor = valor;
	}
	

}
