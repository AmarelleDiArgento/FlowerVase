package com.lotus.lotusvase.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "etapa")
public class Etapa  implements Serializable{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "Ensayo_id")
	private String Ensayo_id;
	@Column(name = "simulacion_id")
	private int simulacion_id;
	@Column(name = "fechaFlorero")
	private Date fechaFlorero;
	@Column(name = "fechaCorte")
	private Date fechaCorte;
	
	public Etapa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etapa(String nombre, String ensayo_id, int simulacion_id, Date fechaFlorero, Date fechaCorte) {
		super();
		this.nombre = nombre;
		Ensayo_id = ensayo_id;
		this.simulacion_id = simulacion_id;
		this.fechaFlorero = fechaFlorero;
		this.fechaCorte = fechaCorte;
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

	public String getEnsayo_id() {
		return Ensayo_id;
	}

	public void setEnsayo_id(String ensayo_id) {
		Ensayo_id = ensayo_id;
	}

	public int getSimulacion_id() {
		return simulacion_id;
	}

	public void setSimulacion_id(int simulacion_id) {
		this.simulacion_id = simulacion_id;
	}

	public Date getFechaFlorero() {
		return fechaFlorero;
	}

	public void setFechaFlorero(Date fechaFlorero) {
		this.fechaFlorero = fechaFlorero;
	}

	public Date getFechaCorte() {
		return fechaCorte;
	}

	public void setFechaCorte(Date fechaCorte) {
		this.fechaCorte = fechaCorte;
	}

}
