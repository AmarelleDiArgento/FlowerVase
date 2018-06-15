package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.ImagenDao;
import com.lotus.lotusvase.model.Imagen;
@Repository
@Transactional
public class ImagenImp extends SessionAbs implements ImagenDao{

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
