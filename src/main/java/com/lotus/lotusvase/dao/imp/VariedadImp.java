package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.VariedadDao;
import com.lotus.lotusvase.model.Variedad;

@Repository
@Transactional
public class VariedadImp extends SessionAbs implements VariedadDao {

	@Override
	public void save(Variedad va) {
		getSession().persist(va);

	}

	@Override
	public void update(Variedad va) {
		getSession().update(va);

	}

	@Override
	public void deleteById(Long id) {
		Variedad va = findById(id);
		if (va != null) {
			getSession().delete(va);
		}

	}

	@Override
	public Variedad findById(Long id) {
		return getSession().get(Variedad.class, id);
	}

	@Override
	public List<Variedad> findAll() {
		return getSession().createQuery("from Variedad").list();
	}

}
