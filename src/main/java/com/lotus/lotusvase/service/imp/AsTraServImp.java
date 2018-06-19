package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.AsignaTraDao;
import com.lotus.lotusvase.model.AsignaTra;
import com.lotus.lotusvase.service.interfaces.AsTraServ;

@Service("atServ")
@Transactional

public class AsTraServImp implements AsTraServ{
	@Autowired
	private AsignaTraDao atDao;
	@Override
	public void save(AsignaTra at) {
		atDao.save(at);
	}

	@Override
	public void update(AsignaTra at) {
		atDao.update(at);
	}

	@Override
	public void deleteById(Long id) {
		atDao.deleteById(id);
	}

	@Override
	public AsignaTra findById(Long id) {
		return atDao.findById(id);
	}

	@Override
	public List<AsignaTra> findAll() {
		return atDao.findAll();
	}

}
