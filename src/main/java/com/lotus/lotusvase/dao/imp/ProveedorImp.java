package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.ProveedorDao;
import com.lotus.lotusvase.model.Proveedor;
@Repository
@Transactional
public class ProveedorImp extends SessionAbs implements  ProveedorDao{

	@Override
	public void save(Proveedor o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Proveedor o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Proveedor findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
