package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.EvaluacionDao;
import com.lotus.lotusvase.model.Evaluacion;
@Repository
@Transactional
public class EvaluacionImp extends SessionAbs implements EvaluacionDao {

	@Override
	public void save(Evaluacion o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Evaluacion o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Evaluacion findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Evaluacion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
