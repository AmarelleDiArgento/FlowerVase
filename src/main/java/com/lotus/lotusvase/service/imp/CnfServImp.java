package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.ConformadoDao;
import com.lotus.lotusvase.model.Conformado;
import com.lotus.lotusvase.service.interfaces.CnfServ;

@Service("cnfServ")
@Transactional

public class CnfServImp implements CnfServ{
	@Autowired
	private ConformadoDao cDao;
	@Override
	public void save(Conformado c) {
		cDao.save(c);
	}

	@Override
	public void update(Conformado c) {
		cDao.update(c);	
	}

	@Override
	public void deleteById(Long id) {
		cDao.deleteById(id);	
	}

	@Override
	public Conformado findById(Long id) {
		return cDao.findById(id);
	}

	@Override
	public List<Conformado> findAll() {
		return cDao.findAll();
	}

}
