package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.VariedadDao;
import com.lotus.lotusvase.model.Variedad;
@Repository
@Transactional
public class VariedadImp extends SessionAbs implements VariedadDao{

	@Override
	public void save(Variedad o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Variedad o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Variedad findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Variedad> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
