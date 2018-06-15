package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "imagen")
public class Imagen implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "lecId")
	private Long lecId;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "url")
	private String url;

	public Imagen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Imagen(Long lecId, String nombre, String url) {
		super();
		this.lecId = lecId;
		this.nombre = nombre;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLecId() {
		return lecId;
	}

	public void setLecId(Long lecId) {
		this.lecId = lecId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	

}
