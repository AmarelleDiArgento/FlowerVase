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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Adicionales a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Adicionales findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adicionales> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
