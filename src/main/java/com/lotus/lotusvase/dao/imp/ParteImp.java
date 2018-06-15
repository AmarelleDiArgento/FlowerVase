package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.ParteDao;
import com.lotus.lotusvase.model.Parte;
@Repository
@Transactional
public class ParteImp extends SessionAbs implements ParteDao{

	@Override
	public void save(Parte o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Parte o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Parte findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Parte> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
