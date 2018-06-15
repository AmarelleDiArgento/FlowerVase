package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AsignaTraDao;
import com.lotus.lotusvase.model.AsignaTra;
@Repository
@Transactional
public class AsignaTraImp extends SessionAbs implements AsignaTraDao {

	@Override
	public void save(AsignaTra o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AsignaTra o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AsignaTra findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AsignaTra> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
