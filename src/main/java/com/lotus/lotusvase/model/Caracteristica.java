package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="caracteristica")
public class Caracteristica implements Serializable{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "unidad")
	private int unidad;
	@Column(name = "descripcion")
	private String descripcion;
	
	
	public Caracteristica() {
	super();
		// TODO Auto-generated constructor stub
	}


	public Caracteristica(String nombre, int unidad, String descripcion) {
		super();
		this.nombre = nombre;
		this.unidad = unidad;
		this.descripcion = descripcion;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getUnidad() {
		return unidad;
	}


	public void setUnidad(int unidad) {
		this.unidad = unidad;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
