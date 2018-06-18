package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.PermisoDao;
import com.lotus.lotusvase.model.Permiso;

@Repository
@Transactional
public class PermisoImp extends SessionAbs implements PermisoDao{

	@Override
	public void save(Permiso pe) {
		getSession().persist(pe);
		
	}

	@Override
	public void update(Permiso pe) {
		getSession().update(pe);
		
	}

	@Override
	public void deleteById(Long id) {
		Permiso pe = findById(id);
		if (pe != null) {
			getSession().delete(pe);
		}
		
	}

	@Override
	public Permiso findById(Long id) {
		return getSession().get(Permiso.class, id);
	}

	@Override
	public List<Permiso> findAll() {
		return getSession().createQuery("from Permiso").list();
	}

}
