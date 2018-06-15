package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AfectaDao;
import com.lotus.lotusvase.model.Afecta;
@Repository
@Transactional
public class AfectaImp extends SessionAbs implements AfectaDao {

	@Override
	public void save(Afecta o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Afecta o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Afecta findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Afecta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
