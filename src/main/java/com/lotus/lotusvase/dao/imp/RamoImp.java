package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.RamoDao;
import com.lotus.lotusvase.model.Ramo;
@Repository
@Transactional
public class RamoImp extends SessionAbs implements RamoDao{

	@Override
	public void save(Ramo o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Ramo o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ramo findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ramo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
