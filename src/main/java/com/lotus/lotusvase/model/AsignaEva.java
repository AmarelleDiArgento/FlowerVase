package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asignaEva")
public class AsignaEva implements Serializable{

	@Id
	@Column(name="ramId")
	private int ramId;
	@Id
	@Column(name="evaId")
	private int evaId;
	@Column(name="tallos")
	private double tallos;

	public AsignaEva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRamId() {
		return ramId;
	}

	public void setRamId(int ramId) {
		this.ramId = ramId;
	}

	public int getEvaId() {
		return evaId;
	}

	public void setEvaId(int evaId) {
		this.evaId = evaId;
	}

	public double getTallos() {
		return tallos;
	}

	public void setTallos(double tallos) {
		this.tallos = tallos;
	}
	

}
