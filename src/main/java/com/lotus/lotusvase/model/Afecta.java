package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "afecta")
public class Afecta implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	@Column(name = "parId")
	private int parId;
	@Column(name = "cauId")
	private int cauId;
	@Column(name = "eliminado")
	private boolean eliminado;
	
	public Afecta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Afecta(int parId, int cauId, boolean eliminado) {
		super();
		this.parId = parId;
		this.cauId = cauId;
		this.eliminado = eliminado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getParId() {
		return parId;
	}

	public void setParId(int parId) {
		this.parId = parId;
	}

	public int getCauId() {
		return cauId;
	}

	public void setCauId(int cauId) {
		this.cauId = cauId;
	}

	public boolean isEliminado() {
		return eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}

}
