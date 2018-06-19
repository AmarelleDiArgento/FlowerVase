package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.AsignaRolDao;
import com.lotus.lotusvase.model.AsignaRol;
import com.lotus.lotusvase.service.interfaces.AsRolServ;

@Service("arServ")
@Transactional

public class AsRolServImp implements AsRolServ{
	@Autowired
	private AsignaRolDao arDao;
	@Override
	public void save(AsignaRol ar) {
		arDao.save(ar);
	}

	@Override
	public void update(AsignaRol ar) {
		arDao.update(ar);
	}

	@Override
	public void deleteById(Long id) {
		arDao.deleteById(id);
	}

	@Override
	public AsignaRol findById(Long id) {
		return arDao.findById(id);
	}

	@Override
	public List<AsignaRol> findAll() {
		return arDao.findAll();
	}

}
