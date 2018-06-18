package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.ParteDao;
import com.lotus.lotusvase.model.Parte;
import com.lotus.lotusvase.service.interfaces.PrtServ;

@Service("prtServ")
@Transactional

public class PrtServImp implements PrtServ{
	@Autowired
	private ParteDao pDao;
	@Override
	public void save(Parte o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Parte o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Parte findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Parte> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
