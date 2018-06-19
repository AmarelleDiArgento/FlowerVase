package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.ProductoDao;
import com.lotus.lotusvase.model.Producto;
import com.lotus.lotusvase.service.interfaces.PtoServ;

@Service("ptoServ")
@Transactional

public class PtoServImp implements PtoServ {
	@Autowired
	private ProductoDao pDao;

	@Override
	public void save(Producto p) {
		pDao.save(p);
	}

	@Override
	public void update(Producto p) {
		pDao.update(p);
	}

	@Override
	public void deleteById(Long id) {
		pDao.deleteById(id);
	}

	@Override
	public Producto findById(Long id) {
		return pDao.findById(id);
	}

	@Override
	public List<Producto> findAll() {
		return pDao.findAll();
	}

}
