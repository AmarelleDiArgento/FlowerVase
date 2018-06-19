package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.AsignaEvaDao;
import com.lotus.lotusvase.model.AsignaEva;
import com.lotus.lotusvase.service.interfaces.AsEvaServ;

@Service("aeServ")
@Transactional

public class AsEvaServImp implements AsEvaServ{
	@Autowired
	private AsignaEvaDao aeDao;
	@Override
	public void save(AsignaEva ae) {
		aeDao.save(ae);	
	}

	@Override
	public void update(AsignaEva ae) {
		aeDao.update(ae);
	}

	@Override
	public void deleteById(Long id) {
		aeDao.deleteById(id);
	}

	@Override
	public AsignaEva findById(Long id) {
		return aeDao.findById(id);
	}

	@Override
	public List<AsignaEva> findAll() {
		return aeDao.findAll();
	}

}
