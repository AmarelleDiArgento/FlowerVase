package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.AreaAfectadaDao;
import com.lotus.lotusvase.model.AreaAfectada;
import com.lotus.lotusvase.service.interfaces.ArAfeServ;

@Service("araServ")
@Transactional

public class ArAfeServImp implements ArAfeServ {
	private AreaAfectadaDao arDao;

	@Override
	public void save(AreaAfectada ar) {
		arDao.save(ar);
	}

	@Override
	public void update(AreaAfectada ar) {
		arDao.update(ar);
	}

	@Override
	public void deleteById(Long id) {
		arDao.deleteById(id);
	}

	@Override
	public AreaAfectada findById(Long id) {
		return arDao.findById(id);
	}

	@Override
	public List<AreaAfectada> findAll() {
		return arDao.findAll();
	}

}
