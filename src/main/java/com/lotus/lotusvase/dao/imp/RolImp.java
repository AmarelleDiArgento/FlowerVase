package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.RolDao;
import com.lotus.lotusvase.model.Rol;
@Repository
@Transactional
public class RolImp extends SessionAbs implements  RolDao{

	@Override
	public void save(Rol o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Rol o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rol findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rol> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
