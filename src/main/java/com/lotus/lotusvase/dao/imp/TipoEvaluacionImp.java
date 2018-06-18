package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.TipoEvaluacionDao;
import com.lotus.lotusvase.model.TipoEvaluacion;

@Repository
@Transactional
public class TipoEvaluacionImp extends SessionAbs implements TipoEvaluacionDao {

	@Override
	public void save(TipoEvaluacion te) {
		getSession().persist(te);

	}

	@Override
	public void update(TipoEvaluacion te) {
		getSession().update(te);

	}

	@Override
	public void deleteById(Long id) {
		TipoEvaluacion te = findById(id);
		if (te != null) {
			getSession().delete(te);
		}

	}

	@Override
	public TipoEvaluacion findById(Long id) {
		return getSession().get(TipoEvaluacion.class, id);
	}

	@Override
	public List<TipoEvaluacion> findAll() {
		return getSession().createQuery("from TipoEvaluacion").list();
	}

}
