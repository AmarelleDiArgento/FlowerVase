package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.TratamientoDao;
import com.lotus.lotusvase.model.Tratamiento;

@Repository
@Transactional
public class TratamientoImp extends SessionAbs implements  TratamientoDao{

	@Override
	public void save(Tratamiento tr) {
		getSession().persist(tr);
		
	}

	@Override
	public void update(Tratamiento tr) {
		getSession().update(tr);
		
	}

	@Override
	public void deleteById(Long id) {
		Tratamiento tr = findById(id);
		if (tr != null) {
			getSession().delete(tr);
		}
		
	}

	@Override
	public Tratamiento findById(Long id) {
		return getSession().get(Tratamiento.class, id);
	}

	@Override
	public List<Tratamiento> findAll() {
		return getSession().createQuery("from Tratamiento").list();
	}

}
