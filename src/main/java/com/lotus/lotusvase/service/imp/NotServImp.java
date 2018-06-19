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
	public void save(Nota n) {
		nDao.save(n);	
	}

	@Override
	public void update(Nota n) {
		nDao.update(n);		
	}

	@Override
	public void deleteById(Long id) {
		nDao.deleteById(id);		
	}

	@Override
	public Nota findById(Long id) {
		return nDao.findById(id);
	}

	@Override
	public List<Nota> findAll() {
		return nDao.findAll();
	}

}
