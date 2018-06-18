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
