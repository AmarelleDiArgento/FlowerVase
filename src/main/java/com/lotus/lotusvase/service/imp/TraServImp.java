package com.lotus.lotusvase.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotus.lotusvase.dao.interfaces.TratamientoDao;
import com.lotus.lotusvase.model.Tratamiento;
import com.lotus.lotusvase.service.interfaces.TraServ;

@Service("traServ")
@Transactional

public class TraServImp implements TraServ {
	@Autowired
	private TratamientoDao tDAo;

	@Override
	public void save(Tratamiento t) {
		tDAo.save(t);
	}

	@Override
	public void update(Tratamiento t) {
		tDAo.update(t);
	}

	@Override
	public void deleteById(Long id) {
		tDAo.deleteById(id);
	}

	@Override
	public Tratamiento findById(Long id) {
		return tDAo.findById(id);
	}

	@Override
	public List<Tratamiento> findAll() {
		return tDAo.findAll();
	}

}
