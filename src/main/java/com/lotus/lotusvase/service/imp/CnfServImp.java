package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.ConformadoDao;
import com.lotus.lotusvase.model.Conformado;
import com.lotus.lotusvase.service.interfaces.CnfServ;

@Service("cnfServ")
@Transactional

public class CnfServImp implements CnfServ{
	@Autowired
	private ConformadoDao cDao;
	@Override
	public void save(Conformado o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Conformado o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Conformado findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conformado> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
