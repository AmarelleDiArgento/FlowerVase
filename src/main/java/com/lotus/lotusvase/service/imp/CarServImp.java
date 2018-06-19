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
	public void save(Caracteristica c) {
		cDao.save(c);	
	}

	@Override
	public void update(Caracteristica c) {
		cDao.update(c);
	}

	@Override
	public void deleteById(Long id) {
		cDao.deleteById(id);
	}

	@Override
	public Caracteristica findById(Long id) {
		return cDao.findById(id);
	}

	@Override
	public List<Caracteristica> findAll() {
		return cDao.findAll();
	}

}
