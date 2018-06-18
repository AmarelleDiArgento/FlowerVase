package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.CausaDao;
import com.lotus.lotusvase.model.Causa;

@Repository
@Transactional
public class CausaImp extends SessionAbs implements CausaDao {

	@Override
	public void save(Causa ca) {
		getSession().persist(ca);
		
	}

	@Override
	public void update(Causa ca) {
		getSession().update(ca);
		
	}

	@Override
	public void deleteById(Long id) {
		Causa ca = findById(id);
		if (ca != null) {
			getSession().delete(ca);
		}
		
	}

	@Override
	public Causa findById(Long id) {
		return getSession().get(Causa.class, id);
	}

	@Override
	public List<Causa> findAll() {
		return getSession().createQuery("from Causa").list();
	}

}
