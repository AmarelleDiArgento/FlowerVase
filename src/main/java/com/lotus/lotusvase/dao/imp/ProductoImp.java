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
	public void save(Producto pd) {
		getSession().persist(pd);
		
	}

	@Override
	public void update(Producto pd) {
		getSession().update(pd);
		
	}

	@Override
	public void deleteById(Long id) {
		Producto pd = findById(id);
		if (pd != null) {
			getSession().delete(pd);
		}
		
	}

	@Override
	public Producto findById(Long id) {
		return getSession().get(Producto.class, id);
	}

	@Override
	public List<Producto> findAll() {
		return getSession().createQuery("from Producto").list();
	}

}
