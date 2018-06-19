package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.ImagenDao;
import com.lotus.lotusvase.model.Imagen;
import com.lotus.lotusvase.service.interfaces.ImaServ;

@Service("imaServ")
@Transactional

public class ImaServImp implements ImaServ {
	@Autowired
	private ImagenDao iDao;
	@Override
	public void save(Imagen i) {
		iDao.save(i);	
	}

	@Override
	public void update(Imagen i) {
		iDao.update(i);	
	}

	@Override
	public void deleteById(Long id) {
		iDao.deleteById(id);
	}

	@Override
	public Imagen findById(Long id) {
		return iDao.findById(id);
	}

	@Override
	public List<Imagen> findAll() {
		return iDao.findAll();
	}

}
