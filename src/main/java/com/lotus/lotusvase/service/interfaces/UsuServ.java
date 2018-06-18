package com.lotus.lotusvase.service.interfaces;

import com.lotus.lotusvase.dao.dao;
import com.lotus.lotusvase.model.Usuario;

public interface UsuServ  extends dao<Usuario, String>{
	public Usuario findByName(String name);

}
