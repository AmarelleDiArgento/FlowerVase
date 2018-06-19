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
	public void save(TipoProveedor tp) {
		tpDao.save(tp);
		
	}

	@Override
	public void update(TipoProveedor tp) {
tpDao.update(tp);}

	@Override
	public void deleteById(Long id) {
		tpDao.deleteById(id);}

	@Override
	public TipoProveedor findById(Long id) {
		return tpDao.findById(id);
	}

	@Override
	public List<TipoProveedor> findAll() {
		return tpDao.findAll();
	}

}
