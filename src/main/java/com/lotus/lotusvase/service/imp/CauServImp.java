package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.CausaDao;
import com.lotus.lotusvase.model.Causa;
import com.lotus.lotusvase.service.interfaces.CauServ;

@Service("cauServ")
@Transactional

public class CauServImp implements CauServ {
	@Autowired
	private CausaDao cDao;
	@Override
	public void save(Causa o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Causa o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Causa findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Causa> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
