package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AsignaCarDao;
import com.lotus.lotusvase.model.AsignaCar;

@Repository
@Transactional
public class AsignaCarImp extends SessionAbs implements AsignaCarDao {

	@Override
	public void save(AsignaCar ac) {
		getSession().persist(ac);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AsignaCar ac) {
		getSession().update(ac);
		
	}

	@Override
	public void deleteById(Long id) {
		AsignaCar ac = findById(id);
		if (ac != null) {
			getSession().delete(ac);
		}
		
	}

	@Override
	public AsignaCar findById(Long id) {
		return getSession().get(AsignaCar.class, id);
	}

	@Override
	public List<AsignaCar> findAll() {
		return getSession().createQuery("from AsignaCar").list();
	}

}
