package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.EtapaDao;
import com.lotus.lotusvase.model.Etapa;
import com.lotus.lotusvase.service.interfaces.EtaServ;

@Service("etaServ")
@Transactional

public class EtaServImp implements EtaServ{
	@Autowired
	private EtapaDao eDao;
	@Override
	public void save(Etapa e) {
		eDao.save(e);
	}

	@Override
	public void update(Etapa e) {
		eDao.update(e);	
	}

	@Override
	public void deleteById(Long id) {
		eDao.deleteById(id);
	}

	@Override
	public Etapa findById(Long id) {
		return eDao.findById(id);
	}

	@Override
	public List<Etapa> findAll() {
		return eDao.findAll();
	}

}
