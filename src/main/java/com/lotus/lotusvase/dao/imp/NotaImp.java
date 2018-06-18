package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.NotaDao;
import com.lotus.lotusvase.model.Nota;

@Repository
@Transactional
public class NotaImp extends SessionAbs implements NotaDao {

	@Override
	public void save(Nota nt) {
		getSession().persist(nt);
		
	}

	@Override
	public void update(Nota nt) {
		getSession().update(nt);
		
	}

	@Override
	public void deleteById(Long id) {
		Nota nt = findById(id);
		if (nt != null) {
			getSession().delete(nt);
		}
		
	}

	@Override
	public Nota findById(Long id) {
		return getSession().get(Nota.class, id);
	}

	@Override
	public List<Nota> findAll() {
		return getSession().createQuery("from Nota").list();
	}

}
