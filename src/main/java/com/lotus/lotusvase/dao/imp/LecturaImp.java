package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.LecturaDao;
import com.lotus.lotusvase.model.Lectura;

@Repository
@Transactional
public class LecturaImp extends SessionAbs implements  LecturaDao{

	@Override
	public void save(Lectura lc) {
		getSession().persist(lc);
		
	}

	@Override
	public void update(Lectura lc) {
		getSession().update(lc);
		
	}

	@Override
	public void deleteById(Long id) {
		Lectura lc = findById(id);
		if (lc != null) {
			getSession().delete(lc);
		}
		
	}

	@Override
	public Lectura findById(Long id) {
		return getSession().get(Lectura.class, id);
	}

	@Override
	public List<Lectura> findAll() {
		return getSession().createQuery("from Lectura").list();
	}

}
