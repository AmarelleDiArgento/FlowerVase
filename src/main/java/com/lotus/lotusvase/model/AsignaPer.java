package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="asignaPer")
public class AsignaPer implements Serializable{
	@Column(name="rolId")
	private int rolId;
	@Column(name="perId")
	private int perId;
	@Column(name="leer")
	private int leer;
	@Column(name="nuevo")
	private int nuevo;
	@Column(name="modificar")
	private int modificar;
	@Column(name="eliminar")
	private int eliminar;
	
	public AsignaPer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRolId() {
		return rolId;
	}

	public void setRolId(int rolId) {
		this.rolId = rolId;
	}

	public int getPerId() {
		return perId;
	}

	public void setPerId(int perId) {
		this.perId = perId;
	}

	public int getLeer() {
		return leer;
	}

	public void setLeer(int leer) {
		this.leer = leer;
	}

	public int getNuevo() {
		return nuevo;
	}

	public void setNuevo(int nuevo) {
		this.nuevo = nuevo;
	}

	public int getModificar() {
		return modificar;
	}

	public void setModificar(int modificar) {
		this.modificar = modificar;
	}

	public int getEliminar() {
		return eliminar;
	}

	public void setEliminar(int eliminar) {
		this.eliminar = eliminar;
	}

	
}
