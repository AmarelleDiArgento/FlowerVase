package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conformado")
public class Conformado implements Serializable{
	@Id
	@Column(name = "parId")
	private Long parId;
	@Column(name = "proId")
	private Long proId;
	
	public Conformado() {
		// TODO Auto-generated constructor stub
	}
	public Long getParId() {
		return parId;
	}
	public void setParId(Long parId) {
		this.parId = parId;
	}
	public Long getProId() {
		return proId;
	}
	public void setProId(Long proId) {
		this.proId = proId;
	}

}
