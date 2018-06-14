package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "areaAfectada")
public class AreaAfectada implements Serializable{
	
	@Column(name = "lecId")
	private int lecId;
	@Column(name = "afeId")
	private int afeId;
	@Column(name = "eliminado")
	private boolean eliminado;
	
	public AreaAfectada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLecId() {
		return lecId;
	}

	public void setLecId(int lecId) {
		this.lecId = lecId;
	}

	public int getAfeId() {
		return afeId;
	}

	public void setAfeId(int afeId) {
		this.afeId = afeId;
	}

	public boolean isEliminado() {
		return eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}

}
