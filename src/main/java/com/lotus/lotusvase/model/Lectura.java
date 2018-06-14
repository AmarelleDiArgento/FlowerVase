package com.lotus.lotusvase.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Lectura implements Serializable{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int id;
	@Column(name = "ramId")
	private int ramId;
	@Column(name = "numTallos")
	private int numTallos;	
	@Column(name = "fecha")
	private Date fecha;
	
	public Lectura() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Lectura(int ramId, int numTallos, Date fecha) {
		super();
		this.ramId = ramId;
		this.numTallos = numTallos;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRamId() {
		return ramId;
	}

	public void setRamId(int ramId) {
		this.ramId = ramId;
	}

	public int getNumTallos() {
		return numTallos;
	}

	public void setNumTallos(int numTallos) {
		this.numTallos = numTallos;
	}



}
