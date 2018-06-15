package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="asignaTra")
public class AsignaTra implements Serializable{
	
	@Column(name="etaId")
	private Long etaId;
	@Column(name="tratId")
	private Long tratId;

	public AsignaTra() {
		// TODO Auto-generated constructor stub
	}

	public Long getEtaId() {
		return etaId;
	}

	public void setEtaId(Long etaId) {
		this.etaId = etaId;
	}

	public Long getTratId() {
		return tratId;
	}

	public void setTratId(Long tratId) {
		this.tratId = tratId;
	}

}
