package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.LecturaDao;
import com.lotus.lotusvase.model.Lectura;
import com.lotus.lotusvase.service.interfaces.LecServ;

@Service("lecServ")
@Transactional

public class LecServImp implements LecServ{
	@Autowired
	private LecturaDao lDao;
	@Override
	public void save(Lectura o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Lectura o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Lectura findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lectura> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
