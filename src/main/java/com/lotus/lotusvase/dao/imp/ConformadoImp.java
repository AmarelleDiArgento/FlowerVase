package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.ConformadoDao;
import com.lotus.lotusvase.model.Conformado;

@Repository
@Transactional
public class ConformadoImp extends SessionAbs implements ConformadoDao {

	@Override
	public void save(Conformado co) {
		getSession().persist(co);

	}

	@Override
	public void update(Conformado co) {
		getSession().update(co);

	}

	@Override
	public void deleteById(Long id) {
		Conformado co = findById(id);
		if (co != null) {
			getSession().delete(co);
		}

	}

	@Override
	public Conformado findById(Long id) {
		return getSession().get(Conformado.class, id);
	}

	@Override
	public List<Conformado> findAll() {
		return getSession().createQuery("from Conformado").list();
	}

}
