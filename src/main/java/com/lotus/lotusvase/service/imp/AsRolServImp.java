package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.AsignaRolDao;
import com.lotus.lotusvase.model.AsignaRol;
import com.lotus.lotusvase.service.interfaces.AsRolServ;

@Service("arServ")
@Transactional

public class AsRolServImp implements AsRolServ{
	@Autowired
	private AsignaRolDao arDao;
	@Override
	public void save(AsignaRol o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AsignaRol o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AsignaRol findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AsignaRol> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
