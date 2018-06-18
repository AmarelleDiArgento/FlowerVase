package com.lotus.lotusvase.service.imp;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lotus.lotusvase.dao.interfaces.UsuarioDao;
import com.lotus.lotusvase.model.Usuario;
import com.lotus.lotusvase.service.interfaces.UsuServ;

@Service("usuServ")
@Transactional

public class UsuServImp implements UsuServ {

	@Autowired
	private UsuarioDao uDao;

	@Override
	public void save(Usuario u) {
		uDao.save(u);
	}

	@Override
	public void update(Usuario u) {
		uDao.update(u);
	}

	@Override
	public void deleteById(String cod) {
		uDao.deleteById(cod);
	}

	@Override
	public Usuario findById(String cod) {
		return uDao.findByName(cod);
	}

	@Override
	public List<Usuario> findAll() {
		return uDao.findAll();
	}

	@Override
	public Usuario findByName(String name) {
		return uDao.findByName(name);
	}

}
