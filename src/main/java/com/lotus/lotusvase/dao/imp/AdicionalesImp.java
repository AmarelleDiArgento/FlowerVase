package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AdicionalesDao;
import com.lotus.lotusvase.model.Adicionales;
@Repository
@Transactional
public class AdicionalesImp extends SessionAbs implements AdicionalesDao {

	@Override
	public void save(Adicionales o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Adicionales o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Adicionales findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adicionales> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
