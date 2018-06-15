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
	private Long lecId;
	@Column(name = "afeId")
	private Long afeId;
	@Column(name = "eliminado")
	private boolean eliminado;
	
	public AreaAfectada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getLecId() {
		return lecId;
	}

	public void setLecId(Long lecId) {
		this.lecId = lecId;
	}

	public Long getAfeId() {
		return afeId;
	}

	public void setAfeId(Long afeId) {
		this.afeId = afeId;
	}

	public boolean isEliminado() {
		return eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}

}
