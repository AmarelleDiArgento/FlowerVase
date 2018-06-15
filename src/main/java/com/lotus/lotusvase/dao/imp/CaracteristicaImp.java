package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.CaracteristicaDao;
import com.lotus.lotusvase.model.Caracteristica;
@Repository
@Transactional
public class CaracteristicaImp extends SessionAbs implements CaracteristicaDao {

	@Override
	public void save(Caracteristica o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Caracteristica o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Caracteristica findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Caracteristica> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
