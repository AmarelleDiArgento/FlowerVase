package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AsignaCarDao;
import com.lotus.lotusvase.model.AsignaCar;
@Repository
@Transactional
public class AsignaCarImp extends SessionAbs implements AsignaCarDao {

	@Override
	public void save(AsignaCar o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AsignaCar o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AsignaCar findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AsignaCar> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
