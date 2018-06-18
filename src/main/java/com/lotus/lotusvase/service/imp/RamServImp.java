package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.RamoDao;
import com.lotus.lotusvase.model.Ramo;
import com.lotus.lotusvase.service.interfaces.RamServ;

@Service("ramServ")
@Transactional

public class RamServImp implements RamServ{
	@Autowired
	private RamoDao rDao;

	@Override
	public void save(Ramo o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Ramo o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ramo findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ramo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
