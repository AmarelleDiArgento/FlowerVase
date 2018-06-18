package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.SimulacionDao;
import com.lotus.lotusvase.model.Simulacion;
import com.lotus.lotusvase.service.interfaces.SimServ;

@Service("simServ")
@Transactional

public class SimServImp implements SimServ{
	@Autowired
	private SimulacionDao sDao;
	@Override
	public void save(Simulacion o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Simulacion o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Simulacion findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Simulacion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
