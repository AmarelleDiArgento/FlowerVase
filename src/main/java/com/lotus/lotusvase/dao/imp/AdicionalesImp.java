package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AdicionalesDao;
import com.lotus.lotusvase.model.Adicionales;

@Repository
@Transactional
public class AdicionalesImp extends SessionAbs implements AdicionalesDao {

	@Override
	public void save(Adicionales a) {

		getSession().persist(a);
		
	}

	@Override
	public void update(Adicionales a) {
		getSession().update(a);
		
	}

	@Override
	public void deleteById(Long id) {
		Adicionales a = findById(id);
		if (a != null) {
			getSession().delete(a);
		}
		
	}

	@Override
	public Adicionales findById(Long id) {
		return getSession().get(Adicionales.class, id);
	}

	@Override
	public List<Adicionales> findAll() {
		return getSession().createQuery("from Adicionales").list();
	}

}
