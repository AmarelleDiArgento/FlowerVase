package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.VariedadDao;
import com.lotus.lotusvase.model.Variedad;
import com.lotus.lotusvase.service.interfaces.VarServ;

@Service("varServ")
@Transactional

public class VarServImp implements VarServ {
	@Autowired
	private VariedadDao vDao;

	@Override
	public void save(Variedad v) {
		vDao.save(v);
	}

	@Override
	public void update(Variedad v) {
		vDao.update(v);
	}

	@Override
	public void deleteById(Long id) {
		vDao.deleteById(id);
	}

	@Override
	public Variedad findById(Long id) {
		return vDao.findById(id);
	}

	@Override
	public List<Variedad> findAll() {
		return vDao.findAll();
	}

}
