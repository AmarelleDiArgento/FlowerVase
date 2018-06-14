package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "variedad")
public class Variedad implements Serializable{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private int nombre;
	@Column(name = "color")
	private int color;
	@Column(name = "producto_id")
	private int producto_id;

	public Variedad() {
		super();
		// TODO Auto-generated constructor stub
	}

}
