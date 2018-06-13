package com.lotus.lotusvase.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "codigo")
	private String codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "usuario")
	private String usuario;
	@Column(name = "password")
	private String password;
	@Column(name = "avatar")
	private String avatar;
	@Column(name = "estado")
	int estado;

	public Usuario(String codigo, String nombre, String usuario, String password, String avatar, int estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.usuario = usuario;
		this.password = password;
		this.avatar = avatar;
		this.estado = estado;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
