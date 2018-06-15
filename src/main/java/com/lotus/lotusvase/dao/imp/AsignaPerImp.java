package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AsignaPerDao;
import com.lotus.lotusvase.model.AsignaPer;
@Repository
@Transactional
public class AsignaPerImp extends SessionAbs implements  AsignaPerDao{

	@Override
	public void save(AsignaPer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AsignaPer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AsignaPer findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AsignaPer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
