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
	public void save(TipoProveedor tp) {
		getSession().persist(tp);
		
	}

	@Override
	public void update(TipoProveedor tp) {
		getSession().update(tp);
		
	}

	@Override
	public void deleteById(Long id) {
		TipoProveedor tp = findById(id);
		if (tp != null) {
			getSession().delete(tp);
		}
		
	}

	@Override
	public TipoProveedor findById(Long id) {
		return getSession().get(TipoProveedor.class, id);
	}

	@Override
	public List<TipoProveedor> findAll() {
		return getSession().createQuery("from TipoProveedor").list();
	}

}
