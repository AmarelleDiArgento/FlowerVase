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

public class TiEvaServImp implements TiEvaServ{
	@Autowired
	private TipoEvaluacionDao tpDao;
	@Override
	public void save(TipoEvaluacion o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TipoEvaluacion o) {
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
