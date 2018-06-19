package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.AsignaCarDao;
import com.lotus.lotusvase.model.AsignaCar;
import com.lotus.lotusvase.service.interfaces.AsCarServ;

@Service("acServ")
@Transactional

public class AsCarServImp implements AsCarServ{
	@Autowired
	private AsignaCarDao acDao;
	@Override
	public void save(AsignaCar ac) {
		acDao.save(ac);
	}

	@Override
	public void update(AsignaCar ac) {
		acDao.update(ac);
	}

	@Override
	public void deleteById(Long id) {
		acDao.deleteById(id);
	}

	@Override
	public AsignaCar findById(Long id) {
		return acDao.findById(id);
	}

	@Override
	public List<AsignaCar> findAll() {
		return acDao.findAll();
	}

}
