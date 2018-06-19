package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.ParteDao;
import com.lotus.lotusvase.model.Parte;
import com.lotus.lotusvase.service.interfaces.PrtServ;

@Service("prtServ")
@Transactional

public class PrtServImp implements PrtServ{
	@Autowired
	private ParteDao pDao;
	@Override
	public void save(Parte p) {
pDao.save(p);
	}

	@Override
	public void update(Parte p) {
		pDao.update(p);
	}


	@Override
	public void deleteById(Long id) {
		pDao.deleteById(id);
	}

	@Override
	public Parte findById(Long id) {
		return pDao.findById(id);
	}

	@Override
	public List<Parte> findAll() {
		return pDao.findAll();
	}

}
