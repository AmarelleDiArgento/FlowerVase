package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.UsuarioDao;
import com.lotus.lotusvase.model.Usuario;

@Repository
@Transactional
public class UsuarioImp extends SessionAbs implements UsuarioDao {

	@Override
	public void save(Usuario u) {
		getSession().persist(u);
	}

	@Override
	public void update(Usuario u) {
		getSession().update(u);
	}

	@Override
	public void deleteById(String cod) {
		Usuario u = findById(cod);
		if (u != null) {
			getSession().delete(u);
		}
	}

	@Override
	public Usuario findById(String cod) {
		return getSession().get(Usuario.class, cod);
	}

	@Override
	public Usuario findByName(String name) {

		return (Usuario) getSession().createQuery(
				"from Usuario where nombre = :name")
				.setParameter("nombre", name)
				.uniqueResult();
	}

	@Override
	public List<Usuario> findAll() {
		return getSession().createQuery("from Usuario").list();
	}

}
