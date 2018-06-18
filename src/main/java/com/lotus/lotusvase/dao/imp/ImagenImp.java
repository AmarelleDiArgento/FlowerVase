package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.ImagenDao;
import com.lotus.lotusvase.model.Imagen;

@Repository
@Transactional
public class ImagenImp extends SessionAbs implements ImagenDao{

	@Override
	public void save(Imagen im) {
		getSession().persist(im);
		
	}

	@Override
	public void update(Imagen im) {
		getSession().update(im);
		
	}

	@Override
	public void deleteById(Long id) {
		Imagen im = findById(id);
		if (im != null) {
			getSession().delete(im);
		}
		
	}

	@Override
	public Imagen findById(Long id) {
		return getSession().get(Imagen.class, id);
	}

	@Override
	public List<Imagen> findAll() {
		return getSession().createQuery("from Imagen").list();
	}

}
