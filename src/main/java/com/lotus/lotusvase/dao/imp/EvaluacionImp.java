package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.EvaluacionDao;
import com.lotus.lotusvase.model.Evaluacion;

@Repository
@Transactional
public class EvaluacionImp extends SessionAbs implements EvaluacionDao {

	@Override
	public void save(Evaluacion ev) {
		getSession().persist(ev);
		
	}

	@Override
	public void update(Evaluacion ev) {
		getSession().update(ev);
		
	}

	@Override
	public void deleteById(Long id) {
		Evaluacion ev = findById(id);
		if (ev != null) {
			getSession().delete(ev);
		}
		
	}

	@Override
	public Evaluacion findById(Long id) {
		return getSession().get(Evaluacion.class, id);
	}

	@Override
	public List<Evaluacion> findAll() {
		return getSession().createQuery("from Evaluacion").list();
	}

}
