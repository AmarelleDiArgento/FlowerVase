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

public class PtoServImp implements PtoServ{
	@Autowired
	private ProductoDao pDao;
	@Override
	public void save(Producto o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Producto o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
