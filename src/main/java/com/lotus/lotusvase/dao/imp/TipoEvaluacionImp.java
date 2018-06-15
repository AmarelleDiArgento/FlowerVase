package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.TipoEvaluacionDao;
import com.lotus.lotusvase.model.TipoEvaluacion;

@Repository
@Transactional
public class TipoEvaluacionImp extends SessionAbs implements TipoEvaluacionDao {

	@Override
	public void save(TipoEvaluacion te) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(TipoEvaluacion te) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public TipoEvaluacion findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoEvaluacion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
