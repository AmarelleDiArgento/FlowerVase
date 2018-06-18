package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AsignaPerDao;
import com.lotus.lotusvase.model.AsignaPer;

@Repository
@Transactional
public class AsignaPerImp extends SessionAbs implements  AsignaPerDao{

	@Override
	public void save(AsignaPer ap) {
		getSession().persist(ap);
		
	}

	@Override
	public void update(AsignaPer ap) {
		getSession().update(ap);
		
	}

	@Override
	public void deleteById(Long id) {
		AsignaPer ap = findById(id);
		if (ap != null) {
			getSession().delete(ap);
		}
		
	}

	@Override
	public AsignaPer findById(Long id) {
		return getSession().get(AsignaPer.class, id);
	}

	@Override
	public List<AsignaPer> findAll() {
		return getSession().createQuery("from AsignaPer").list();
	}

}
