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
	public void save(AsignaPer ap) {
		 apDao.save(ap);	
	}

	@Override
	public void update(AsignaPer ap) {
		 apDao.update(ap);
	}

	@Override
	public void deleteById(Long id) {
		 apDao.deleteById(id);
	}

	@Override
	public AsignaPer findById(Long id) {
		return apDao.findById(id);
	}

	@Override
	public List<AsignaPer> findAll() {
		return apDao.findAll();
	}

}
