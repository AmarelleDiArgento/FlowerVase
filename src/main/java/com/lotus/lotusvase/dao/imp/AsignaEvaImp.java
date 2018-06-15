package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AsignaEvaDao;
import com.lotus.lotusvase.model.AsignaEva;
@Repository
@Transactional
public class AsignaEvaImp extends SessionAbs implements AsignaEvaDao{

	@Override
	public void save(AsignaEva o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AsignaEva o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AsignaEva findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AsignaEva> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
