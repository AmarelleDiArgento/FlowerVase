package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AsignaTraDao;
import com.lotus.lotusvase.model.AsignaTra;

@Repository
@Transactional
public class AsignaTraImp extends SessionAbs implements AsignaTraDao {

	@Override
	public void save(AsignaTra at) {
		getSession().persist(at);
		
	}

	@Override
	public void update(AsignaTra at) {
		getSession().update(at);
		
	}

	@Override
	public void deleteById(Long id) {
		AsignaTra at = findById(id);
		if (at != null) {
			getSession().delete(at);
		}
		
	}

	@Override
	public AsignaTra findById(Long id) {
		return getSession().get(AsignaTra.class, id);
	}

	@Override
	public List<AsignaTra> findAll() {
		return getSession().createQuery("from AsignaTra").list();
	}

}
