package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.TipoProveedorDao;
import com.lotus.lotusvase.model.TipoProveedor;
@Repository
@Transactional
public class TipoProveedorImp extends SessionAbs implements TipoProveedorDao{

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
