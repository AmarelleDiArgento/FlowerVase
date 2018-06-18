package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AsignaEvaDao;
import com.lotus.lotusvase.model.AsignaEva;

@Repository
@Transactional
public class AsignaEvaImp extends SessionAbs implements AsignaEvaDao{

	@Override
	public void save(AsignaEva ae) {
		getSession().persist(ae);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AsignaEva ae) {
		getSession().update(ae);
		
	}

	@Override
	public void deleteById(Long id) {
		AsignaEva ae = findById(id);
		if (ae != null) {
			getSession().delete(ae);
		}
		
	}

	@Override
	public AsignaEva findById(Long id) {
		return getSession().get(AsignaEva.class, id);
	}

	@Override
	public List<AsignaEva> findAll() {
		return getSession().createQuery("from AsignaEva").list();
	}

}
