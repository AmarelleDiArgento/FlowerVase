package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.RamoDao;
import com.lotus.lotusvase.model.Ramo;
import com.lotus.lotusvase.service.interfaces.RamServ;

@Service("ramServ")
@Transactional

public class RamServImp implements RamServ {
	@Autowired
	private RamoDao rDao;

	@Override
	public void save(Ramo r) {
		rDao.save(r);
	}

	@Override
	public void update(Ramo r) {
		rDao.update(r);
	}

	@Override
	public void deleteById(Long id) {
		rDao.deleteById(id);
	}

	@Override
	public Ramo findById(Long id) {
		return rDao.findById(id);
	}

	@Override
	public List<Ramo> findAll() {
		return rDao.findAll();
	}

}
