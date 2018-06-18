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
	public void save(Imagen o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Imagen o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Imagen findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Imagen> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
