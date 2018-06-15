package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.EtapaDao;
import com.lotus.lotusvase.model.Conformado;
@Repository
@Transactional
public class EtapaImp extends SessionAbs implements EtapaDao{

	@Override
	public void save(Conformado o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Conformado o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Conformado findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conformado> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
