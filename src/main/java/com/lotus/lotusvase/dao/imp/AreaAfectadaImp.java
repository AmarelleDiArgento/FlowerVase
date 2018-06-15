package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AreaAfectadaDao;
import com.lotus.lotusvase.model.AreaAfectada;
@Repository
@Transactional
public class AreaAfectadaImp extends SessionAbs implements  AreaAfectadaDao{

	@Override
	public void save(AreaAfectada o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AreaAfectada o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AreaAfectada findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AreaAfectada> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
