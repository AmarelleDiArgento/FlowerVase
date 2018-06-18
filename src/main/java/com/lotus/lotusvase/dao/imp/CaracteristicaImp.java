package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.CaracteristicaDao;
import com.lotus.lotusvase.model.Caracteristica;

@Repository
@Transactional
public class CaracteristicaImp extends SessionAbs implements CaracteristicaDao {

	@Override
	public void save(Caracteristica cr) {
		getSession().persist(cr);
		
	}

	@Override
	public void update(Caracteristica cr) {
		getSession().update(cr);
		
	}

	@Override
	public void deleteById(Long id) {
		Caracteristica cr = findById(id);
		if (cr != null) {
			getSession().delete(cr);
		}
		
	}

	@Override
	public Caracteristica findById(Long id) {
		return getSession().get(Caracteristica.class, id);
	}

	@Override
	public List<Caracteristica> findAll() {
		return getSession().createQuery("from Caracteristica").list();
	}

}
