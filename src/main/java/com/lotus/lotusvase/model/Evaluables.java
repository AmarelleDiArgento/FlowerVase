package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evaluables")
public class Evaluables implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int id;
	@Column(name = "proId")
	private int proId;
	@Column(name = "varId")
	private int varId;
	
	public Evaluables() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evaluables(int proId, int varId) {
		super();
		this.proId = proId;
		this.varId = varId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public int getVarId() {
		return varId;
	}

	public void setVarId(int varId) {
		this.varId = varId;
	}
	
}
