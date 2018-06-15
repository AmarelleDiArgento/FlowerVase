package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.CausaDao;
import com.lotus.lotusvase.model.Causa;
@Repository
@Transactional
public class CausaImp extends SessionAbs implements CausaDao {

	@Override
	public void save(Causa o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Causa o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Causa findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Causa> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
