package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.ProductoDao;
import com.lotus.lotusvase.model.Producto;
@Repository
@Transactional
public class ProductoImp extends SessionAbs implements ProductoDao {

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
