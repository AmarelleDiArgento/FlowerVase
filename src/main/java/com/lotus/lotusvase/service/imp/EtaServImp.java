package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.EtapaDao;
import com.lotus.lotusvase.model.Etapa;
import com.lotus.lotusvase.service.interfaces.EtaServ;

@Service("etaServ")
@Transactional

public class EtaServImp implements EtaServ{
	@Autowired
	private EtapaDao eDao;
	@Override
	public void save(Etapa o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Etapa o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Etapa findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Etapa> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
