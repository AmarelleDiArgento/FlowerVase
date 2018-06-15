package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AsignaRolDao;
import com.lotus.lotusvase.model.AsignaRol;
@Repository
@Transactional
public class AsignaRolImp extends SessionAbs implements AsignaRolDao {

	@Override
	public void save(AsignaRol o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AsignaRol o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AsignaRol findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AsignaRol> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
