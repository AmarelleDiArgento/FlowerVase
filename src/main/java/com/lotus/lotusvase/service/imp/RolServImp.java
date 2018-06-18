package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.RolDao;
import com.lotus.lotusvase.model.Rol;
import com.lotus.lotusvase.service.interfaces.RolServ;

@Service("rolServ")
@Transactional

public class RolServImp implements RolServ{
	@Autowired
	private RolDao rDAo;
	@Override
	public void save(Rol o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Rol o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rol findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rol> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
