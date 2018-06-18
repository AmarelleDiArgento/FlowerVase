package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.RolDao;
import com.lotus.lotusvase.model.Rol;

@Repository
@Transactional
public class RolImp extends SessionAbs implements  RolDao{

	@Override
	public void save(Rol ro) {
		getSession().persist(ro);
		
	}

	@Override
	public void update(Rol ro) {
		getSession().update(ro);
		
	}

	@Override
	public void deleteById(Long id) {
		Rol ro = findById(id);
		if (ro != null) {
			getSession().delete(ro);
		}
		
	}

	@Override
	public Rol findById(Long id) {
		return getSession().get(Rol.class, id);
	}

	@Override
	public List<Rol> findAll() {
		return getSession().createQuery("from Rol").list();
	}

}
