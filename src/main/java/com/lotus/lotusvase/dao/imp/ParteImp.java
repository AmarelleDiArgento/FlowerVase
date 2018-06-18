package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.ParteDao;
import com.lotus.lotusvase.model.Parte;

@Repository
@Transactional
public class ParteImp extends SessionAbs implements ParteDao{

	@Override
	public void save(Parte pr) {
		getSession().persist(pr);
		
	}

	@Override
	public void update(Parte pr) {
		getSession().update(pr);
		
	}

	@Override
	public void deleteById(Long id) {
		Parte pr = findById(id);
		if (pr != null) {
			getSession().delete(pr);
		}
		
	}

	@Override
	public Parte findById(Long id) {
		return getSession().get(Parte.class, id);
	}

	@Override
	public List<Parte> findAll() {
		return getSession().createQuery("from Parte").list();
	}

}
