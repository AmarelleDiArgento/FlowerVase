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

public class PdrServImp implements  PdrServ{
	@Autowired
	private ProveedorDao pDao;
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
