package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="asignaTra")
public class AsignaTra implements Serializable{
	
	@Column(name="etaId")
	private int etaId;
	@Column(name="tratId")
	private int tratId;

	public AsignaTra() {
		// TODO Auto-generated constructor stub
	}

	public int getEtaId() {
		return etaId;
	}

	public void setEtaId(int etaId) {
		this.etaId = etaId;
	}

	public int getTratId() {
		return tratId;
	}

	public void setTratId(int tratId) {
		this.tratId = tratId;
	}

}
