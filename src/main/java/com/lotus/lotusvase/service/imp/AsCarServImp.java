package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.AsignaCarDao;
import com.lotus.lotusvase.model.AsignaCar;
import com.lotus.lotusvase.service.interfaces.AsCarServ;

@Service("acServ")
@Transactional

public class AsCarServImp implements AsCarServ{
	@Autowired
	private AsignaCarDao acDao;
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
