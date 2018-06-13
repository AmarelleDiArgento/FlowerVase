package com.lotus.lotusvase.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lotus.lotusvase.dao.interfaces.UsuarioDao;
import com.lotus.lotusvase.model.Usuario;

@Service("usuServ")
@Transactional

public class UsuarioServImp implements UsuarioService{

	@Autowired
	private UsuarioDao uDao;
	
	@Override
	public void save(Usuario u) {
		uDao.save(u);
	}

	@Override
	public void update(Usuario u) {
		// TODO Auto-generated method stub
		uDao.update(u);
	}

	@Override
	public void deleteById(String cod) {
		uDao.deleteById(cod);
		}

	@Override
	public Usuario findById(String cod) {
		
		return  uDao.findByName(cod);
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return uDao.findAll();
	}

	@Override
	public Usuario findByName(String name) {
		// TODO Auto-generated method stub
		return uDao.findByName(name);
	}
	

}
