package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.EvaluacionDao;
import com.lotus.lotusvase.model.Evaluacion;
import com.lotus.lotusvase.service.interfaces.EvcServ;

@Service("evcServ")
@Transactional

public class EvcServImp implements EvcServ{
	@Autowired
	private EvaluacionDao eDao;
	@Override
	public void save(Evaluacion e) {
		eDao.save(e);
	}

	@Override
	public void update(Evaluacion e) {
		eDao.update(e);
	}

	@Override
	public void deleteById(Long id) {
		eDao.deleteById(id);;
	}

	@Override
	public Evaluacion findById(Long id) {
		return eDao.findById(id);
	}

	@Override
	public List<Evaluacion> findAll() {
		return eDao.findAll();
	}

}
