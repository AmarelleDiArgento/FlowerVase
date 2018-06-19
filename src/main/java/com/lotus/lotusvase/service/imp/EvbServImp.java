package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.EvaluablesDao;
import com.lotus.lotusvase.model.Evaluables;
import com.lotus.lotusvase.service.interfaces.EvbServ;

@Service("evbServ")
@Transactional

public class EvbServImp implements EvbServ {
	@Autowired
	private EvaluablesDao eDao;
	@Override
	public void save(Evaluables e) {
		eDao.save(e);
	}

	@Override
	public void update(Evaluables e) {
		eDao.update(e);	
	}

	@Override
	public void deleteById(Long id) {
		eDao.deleteById(id);
	}

	@Override
	public Evaluables findById(Long id) {
		return eDao.findById(id);
	}

	@Override
	public List<Evaluables> findAll() {
		return eDao.findAll();
	}

}
