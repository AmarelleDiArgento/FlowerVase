package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.PermisoDao;
import com.lotus.lotusvase.model.Permiso;
import com.lotus.lotusvase.service.interfaces.PerServ;

@Service("perServ")
@Transactional

public class PerServImp implements PerServ {
	@Autowired
	private PermisoDao pDao;
	@Override
	public void save(Permiso p) {
pDao.save(p);
	}

	@Override
	public void update(Permiso p) {
		pDao.update(p);
	}


	@Override
	public void deleteById(Long id) {
		pDao.deleteById(id);
	}

	@Override
	public Permiso findById(Long id) {
		return pDao.findById(id);
	}

	@Override
	public List<Permiso> findAll() {
		return pDao.findAll();
	}

}
