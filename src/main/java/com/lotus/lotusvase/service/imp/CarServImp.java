package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.CaracteristicaDao;
import com.lotus.lotusvase.model.Caracteristica;
import com.lotus.lotusvase.service.interfaces.CarServ;

@Service("carServ")
@Transactional

public class CarServImp implements CarServ{
	@Autowired
	private CaracteristicaDao cDao;
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
