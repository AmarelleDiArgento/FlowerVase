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
	public void save(Causa c) {
		cDao.save(c);
	}

	@Override
	public void update(Causa c) {
		cDao.update(c);	
	}

	@Override
	public void deleteById(Long id) {
		cDao.deleteById(id);
	}

	@Override
	public Causa findById(Long id) {
		return cDao.findById(id);
	}

	@Override
	public List<Causa> findAll() {
		return cDao.findAll();
	}

}
