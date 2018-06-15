package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.LecturaDao;
import com.lotus.lotusvase.model.Lectura;
@Repository
@Transactional
public class LecturaImp extends SessionAbs implements  LecturaDao{

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
