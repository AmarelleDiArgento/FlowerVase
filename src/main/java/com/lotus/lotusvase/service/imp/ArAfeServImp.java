package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.AreaAfectadaDao;
import com.lotus.lotusvase.model.AreaAfectada;
import com.lotus.lotusvase.service.interfaces.ArAfeServ;

@Service("arServ")
@Transactional

public class ArAfeServImp implements ArAfeServ {
	private AreaAfectadaDao arDao;

	@Override
	public void save(AreaAfectada ar) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(AreaAfectada ar) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public AreaAfectada findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AreaAfectada> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
