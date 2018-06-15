package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.SimulacionDao;
import com.lotus.lotusvase.model.Simulacion;
@Repository
@Transactional
public class SimulacionImp extends SessionAbs implements SimulacionDao{

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
