package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.TipoProveedorDao;
import com.lotus.lotusvase.model.TipoProveedor;
import com.lotus.lotusvase.service.interfaces.TiProServ;

@Service("tpServ")
@Transactional

public class TiProServÍmp implements TiProServ{
	@Autowired
	private TipoProveedorDao tpDao;
	@Override
	public void save(TipoProveedor o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TipoProveedor o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TipoProveedor findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoProveedor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
