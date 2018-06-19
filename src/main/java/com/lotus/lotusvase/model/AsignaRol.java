package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asignaRol")
public class AsignaRol implements Serializable{
	@Id
	@Column(name="rolId")
	private Long rolId;
	@Id
	@Column(name="usuCod")
	private String usuCod;

	public AsignaRol() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getRolId() {
		return rolId;
	}

	public void setRolId(Long rolId) {
		this.rolId = rolId;
	}

	public String getUsuCod() {
		return usuCod;
	}

	public void setUsuCod(String usuCod) {
		this.usuCod = usuCod;
	}

}
