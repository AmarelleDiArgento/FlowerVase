package com.lotus.lotusvase.service;

import com.lotus.lotusvase.dao.dao;
import com.lotus.lotusvase.model.Usuario;

public interface UsuarioService  extends dao<Usuario, String>{
	public Usuario findByName(String name);

}
