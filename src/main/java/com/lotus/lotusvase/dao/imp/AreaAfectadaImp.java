package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AreaAfectadaDao;
import com.lotus.lotusvase.model.AreaAfectada;

@Repository
@Transactional
public class AreaAfectadaImp extends SessionAbs implements  AreaAfectadaDao{

	@Override
	public void save(AreaAfectada af) {
		getSession().persist(af);
		
	}

	@Override
	public void update(AreaAfectada af) {
		getSession().update(af);
		
	}

	@Override
	public void deleteById(Long id) {
		AreaAfectada af = findById(id);
		if (af != null) {
			getSession().delete(af);
		}
		
	}

	@Override
	public AreaAfectada findById(Long id) {
		return getSession().get(AreaAfectada.class, id);
	}

	@Override
	public List<AreaAfectada> findAll() {
		return getSession().createQuery("from AreaAfectada").list();
	}

}
