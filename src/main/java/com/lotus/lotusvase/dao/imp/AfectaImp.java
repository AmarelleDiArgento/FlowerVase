package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AfectaDao;
import com.lotus.lotusvase.model.Afecta;

@Repository
@Transactional
public class AfectaImp extends SessionAbs implements AfectaDao {

	@Override
	public void save(Afecta a) {
		getSession().persist(a);
		
	}

	@Override
	public void update(Afecta a) {
		getSession().update(a);
		
	}

	@Override
	public void deleteById(Long id) {
		Afecta a = findById(id);
		if (a != null) {
			getSession().delete(a);
		}
		
	}

	@Override
	public Afecta findById(Long id) {
		return getSession().get(Afecta.class, id);
	}

	@Override
	public List<Afecta> findAll() {
		return getSession().createQuery("from Afecta").list();
	}

}
