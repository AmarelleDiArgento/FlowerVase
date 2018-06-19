package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.TipoEvaluacionDao;
import com.lotus.lotusvase.model.TipoEvaluacion;
import com.lotus.lotusvase.service.interfaces.TiEvaServ;

@Service("teServ")
@Transactional

public class TiEvaServImp implements TiEvaServ {
	@Autowired
	private TipoEvaluacionDao teDao;

	@Override
	public void save(TipoEvaluacion te) {
		teDao.save(te);
	}

	@Override
	public void update(TipoEvaluacion te) {
		teDao.update(te);
	}

	@Override
	public void deleteById(Long id) {
		teDao.deleteById(id);
	}

	@Override
	public TipoEvaluacion findById(Long id) {
		return teDao.findById(id);
	}

	@Override
	public List<TipoEvaluacion> findAll() {
		return teDao.findAll();
	}

}
