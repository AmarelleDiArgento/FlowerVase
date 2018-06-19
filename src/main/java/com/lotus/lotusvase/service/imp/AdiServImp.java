package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.AdicionalesDao;
import com.lotus.lotusvase.model.Adicionales;
import com.lotus.lotusvase.service.interfaces.AdiServ;

@Service("adiServ")
@Transactional
public class AdiServImp implements  AdiServ{
	
	@Autowired
	private AdicionalesDao aDao;

	@Override
	public void save(Adicionales a) {
		aDao.save(a);
	}

	@Override
	public void update(Adicionales a) {
		aDao.update(a);
	}

	@Override
	public void deleteById(Long id) {
		aDao.deleteById(id);
	}

	@Override
	public Adicionales findById(Long id) {
		return aDao.findById(id);
	}

	@Override
	public List<Adicionales> findAll() {
		return aDao.findAll();
	}

}
