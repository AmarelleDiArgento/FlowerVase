package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.EvaluablesDao;
import com.lotus.lotusvase.model.Evaluables;

@Repository
@Transactional
public class EvaluablesImp extends SessionAbs implements EvaluablesDao{

	@Override
	public void save(Evaluables ev) {
		getSession().persist(ev);
		
	}

	@Override
	public void update(Evaluables ev) {
		getSession().update(ev);
		
	}

	@Override
	public void deleteById(Long id) {
		Evaluables ev = findById(id);
		if (ev != null) {
			getSession().delete(ev);
		}
		
	}

	@Override
	public Evaluables findById(Long id) {
		return getSession().get(Evaluables.class, id);
	}

	@Override
	public List<Evaluables> findAll() {
		return getSession().createQuery("from Evaluables").list();
	}

}
