package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.EvaluablesDao;
import com.lotus.lotusvase.model.Evaluables;
@Repository
@Transactional
public class EvaluablesImp extends SessionAbs implements EvaluablesDao{

	@Override
	public void save(Evaluables o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Evaluables o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Evaluables findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Evaluables> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
