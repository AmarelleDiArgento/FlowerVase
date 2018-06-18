package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.AsignaTraDao;
import com.lotus.lotusvase.model.AsignaTra;
import com.lotus.lotusvase.service.interfaces.AsTraServ;

@Service("atServ")
@Transactional

public class AsTraServImp implements AsTraServ{
	@Autowired
	private AsignaTraDao atDao;
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
