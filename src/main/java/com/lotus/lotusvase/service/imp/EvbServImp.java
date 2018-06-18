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
