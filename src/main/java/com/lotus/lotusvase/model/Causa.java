package com.lotus.lotusvase.model;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "causa")
public class Causa {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private  String nombre;
	private  String detalle;
	public Causa() {
		super();
		// TODO Auto-generated constructor stub
	}

}
