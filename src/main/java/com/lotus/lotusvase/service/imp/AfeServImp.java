package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.AfectaDao;
import com.lotus.lotusvase.model.Afecta;
import com.lotus.lotusvase.service.interfaces.AfeServ;

@Service("afeServ")
@Transactional

public class AfeServImp implements AfeServ{
	private AfectaDao afDao;

	@Override
	public void save(Afecta af) {
		afDao.save(af);	
	}

	@Override
	public void update(Afecta af) {
		afDao.update(af);
	}

	@Override
	public void deleteById(Long id) {
		afDao.deleteById(id);
	}

	@Override
	public Afecta findById(Long id) {
		return afDao.findById(id);
	}

	@Override
	public List<Afecta> findAll() {
		return afDao.findAll();
	}
}
