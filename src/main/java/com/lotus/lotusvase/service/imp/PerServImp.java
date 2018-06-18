package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.model.Permiso;
import com.lotus.lotusvase.service.interfaces.PerServ;

@Service("perServ")
@Transactional

public class PerServImp implements PerServ {
	@Autowired
	private Permiso pDao;
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
