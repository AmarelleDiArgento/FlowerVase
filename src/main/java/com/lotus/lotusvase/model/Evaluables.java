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
	private Long id;
	@Column(name = "proId")
	private Long proId;
	@Column(name = "varId")
	private Long varId;
	
	public Evaluables() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evaluables(Long proId, Long varId) {
		super();
		this.proId = proId;
		this.varId = varId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProId() {
		return proId;
	}

	public void setProId(Long proId) {
		this.proId = proId;
	}

	public Long getVarId() {
		return varId;
	}

	public void setVarId(Long varId) {
		this.varId = varId;
	}
	
}
