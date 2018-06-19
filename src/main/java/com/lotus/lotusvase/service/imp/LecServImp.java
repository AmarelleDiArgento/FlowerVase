package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.LecturaDao;
import com.lotus.lotusvase.model.Lectura;
import com.lotus.lotusvase.service.interfaces.LecServ;

@Service("lecServ")
@Transactional

public class LecServImp implements LecServ {
	@Autowired
	private LecturaDao lDao;

	@Override
	public void save(Lectura l) {
		lDao.save(l);
	}

	@Override
	public void update(Lectura l) {
		lDao.update(l);
	}

	@Override
	public void deleteById(Long id) {
		lDao.deleteById(id);
	}

	@Override
	public Lectura findById(Long id) {
		return lDao.findById(id);
	}

	@Override
	public List<Lectura> findAll() {
		return lDao.findAll();
	}

}
