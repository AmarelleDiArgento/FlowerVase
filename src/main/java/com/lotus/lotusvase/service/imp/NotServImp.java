package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.NotaDao;
import com.lotus.lotusvase.model.Nota;
import com.lotus.lotusvase.service.interfaces.NotServ;

@Service("notServ")
@Transactional

public class NotServImp implements NotServ {
	@Autowired
	private NotaDao nDao;
	@Override
	public void save(Nota o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Nota o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Nota findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Nota> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
