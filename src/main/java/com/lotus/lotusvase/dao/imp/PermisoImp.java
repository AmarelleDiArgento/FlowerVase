package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.PermisoDao;
import com.lotus.lotusvase.model.Permiso;
@Repository
@Transactional
public class PermisoImp extends SessionAbs implements PermisoDao{

	@Override
	public void save(Permiso o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Permiso o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Permiso findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Permiso> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
