package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.AsignaRolDao;
import com.lotus.lotusvase.model.AsignaRol;

@Repository
@Transactional
public class AsignaRolImp extends SessionAbs implements AsignaRolDao {

	@Override
	public void save(AsignaRol ar) {
		getSession().persist(ar);
		
	}

	@Override
	public void update(AsignaRol ar) {
		getSession().update(ar);
		
	}

	@Override
	public void deleteById(Long id) {
		AsignaRol ar = findById(id);
		if (ar != null) {
			getSession().delete(ar);
		}
		
	}

	@Override
	public AsignaRol findById(Long id) {
		return getSession().get(AsignaRol.class, id);
	}

	@Override
	public List<AsignaRol> findAll() {
		return getSession().createQuery("from AsignaRol").list();
	}

}
