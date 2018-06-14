package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="adicionales")
public class Adicionales implements Serializable{
	
	@Column(name="carId")
	private int carId;
	@Column(name="lecId")
	private int lecId;
	@Column(name="valor")
	private double valor;
	
	public Adicionales() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public int getLecId() {
		return lecId;
	}

	public void setLecId(int lecId) {
		this.lecId = lecId;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double dato) {
		this.valor = valor;
	}
	

}
