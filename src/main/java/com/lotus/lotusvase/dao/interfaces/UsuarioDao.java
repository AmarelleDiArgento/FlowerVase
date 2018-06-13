package com.lotus.lotusvase.dao.interfaces;

import com.lotus.lotusvase.dao.dao;
import com.lotus.lotusvase.model.Usuario;

public interface UsuarioDao  extends dao<Usuario, String>{
	public Usuario findByName(String name);

}
