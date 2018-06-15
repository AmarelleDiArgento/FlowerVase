package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.NotaDao;
import com.lotus.lotusvase.model.Nota;
@Repository
@Transactional
public class NotaImp extends SessionAbs implements NotaDao {

	@Override
	public void save(Nota o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Nota o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Nota findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Nota> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
