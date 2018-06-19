package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.ProveedorDao;
import com.lotus.lotusvase.model.Proveedor;
import com.lotus.lotusvase.service.interfaces.PdrServ;

@Service("pdrServ")
@Transactional

public class PdrServImp implements PdrServ {
	@Autowired
	private ProveedorDao pDao;

	@Override
	public void save(Proveedor p) {
		pDao.save(p);
	}

	@Override
	public void update(Proveedor p) {
		pDao.update(p);
	}


	@Override
	public void deleteById(Long id) {
		pDao.deleteById(id);
	}

	@Override
	public Proveedor findById(Long id) {
		return pDao.findById(id);
	}

	@Override
	public List<Proveedor> findAll() {
		return pDao.findAll();
	}

}
