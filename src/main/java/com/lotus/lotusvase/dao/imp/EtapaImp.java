package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.EtapaDao;
import com.lotus.lotusvase.model.Etapa;

@Repository
@Transactional
public class EtapaImp extends SessionAbs implements EtapaDao{

	@Override
	public void save(Etapa et) {
		getSession().persist(et);
		
	}

	@Override
	public void update(Etapa et) {
		getSession().update(et);
		
	}

	@Override
	public void deleteById(Long id) {
		Etapa et = findById(id);
		if (et != null) {
			getSession().delete(et);
		}
		
	}

	@Override
	public Etapa  findById(Long id) {
		return getSession().get(Etapa.class, id);
	}

	@Override
	public List<Etapa> findAll() {
		return getSession().createQuery("from Etapa").list();
	}

}
