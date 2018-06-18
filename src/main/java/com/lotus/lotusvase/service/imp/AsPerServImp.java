package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.AsignaPerDao;
import com.lotus.lotusvase.model.AsignaPer;
import com.lotus.lotusvase.service.interfaces.AsPerServ;

@Service("apServ")
@Transactional

public class AsPerServImp implements AsPerServ {
	@Autowired
	private AsignaPerDao apDao;
	@Override
	public void save(AsignaPer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AsignaPer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AsignaPer findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AsignaPer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
