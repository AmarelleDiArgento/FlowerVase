package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.AsignaEvaDao;
import com.lotus.lotusvase.model.AsignaEva;
import com.lotus.lotusvase.service.interfaces.AsEvaServ;

@Service("aeServ")
@Transactional

public class AsEvaServImp implements AsEvaServ{
	@Autowired
	private AsignaEvaDao aeDao;
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
