package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.RolDao;
import com.lotus.lotusvase.model.Rol;
import com.lotus.lotusvase.service.interfaces.RolServ;

@Service("rolServ")
@Transactional

public class RolServImp implements RolServ{
	@Autowired
	private RolDao rDao;
	@Override
	public void save(Rol r) {
		rDao.save(r);
	}

	@Override
	public void update(Rol r) {
		rDao.update(r);
	}

	@Override
	public void deleteById(Long id) {
		rDao.deleteById(id);
	}

	@Override
	public Rol findById(Long id) {
		return rDao.findById(id);
	}

	@Override
	public List<Rol> findAll() {
		return rDao.findAll();
	}

}
