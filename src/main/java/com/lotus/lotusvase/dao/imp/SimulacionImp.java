package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.SimulacionDao;
import com.lotus.lotusvase.model.Simulacion;

@Repository
@Transactional
public class SimulacionImp extends SessionAbs implements SimulacionDao{

	@Override
	public void save(Simulacion si) {
		getSession().persist(si);
		
	}

	@Override
	public void update(Simulacion si) {
		getSession().update(si);
		
	}

	@Override
	public void deleteById(Long id) {
		Simulacion si = findById(id);
		if (si != null) {
			getSession().delete(si);
		}
		
	}

	@Override
	public Simulacion findById(Long id) {
		return getSession().get(Simulacion.class, id);
	}

	@Override
	public List<Simulacion> findAll() {
		return getSession().createQuery("from Simulacion").list();
	}

}
