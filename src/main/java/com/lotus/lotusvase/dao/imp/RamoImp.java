package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.RamoDao;
import com.lotus.lotusvase.model.Ramo;

@Repository
@Transactional
public class RamoImp extends SessionAbs implements RamoDao{

	@Override
	public void save(Ramo ra) {
		getSession().persist(ra);
		
	}

	@Override
	public void update(Ramo ra) {
		getSession().update(ra);
		
	}

	@Override
	public void deleteById(Long id) {
		Ramo ra = findById(id);
		if (ra != null) {
			getSession().delete(ra);
		}
		
	}

	@Override
	public Ramo findById(Long id) {
		return getSession().get(Ramo.class, id);
	}

	@Override
	public List<Ramo> findAll() {
		return getSession().createQuery("from Ramo").list();
	}

}
