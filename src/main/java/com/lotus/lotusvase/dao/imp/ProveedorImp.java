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
	public void save(Proveedor pv) {
		getSession().persist(pv);
		
	}

	@Override
	public void update(Proveedor pv) {
		getSession().update(pv);
		
	}

	@Override
	public void deleteById(Long id) {
		Proveedor pv = findById(id);
		if (pv != null) {
			getSession().delete(pv);
		}
		
	}

	@Override
	public Proveedor findById(Long id) {
		return getSession().get(Proveedor.class, id);
	}

	@Override
	public List<Proveedor> findAll() {
		return getSession().createQuery("from Proveedor").list();
	}

}
