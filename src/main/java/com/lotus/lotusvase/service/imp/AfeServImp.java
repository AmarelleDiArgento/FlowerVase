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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Afecta af) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Afecta findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Afecta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
