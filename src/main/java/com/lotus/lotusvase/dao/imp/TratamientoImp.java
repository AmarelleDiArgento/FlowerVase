package com.lotus.lotusvase.dao.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lotus.lotusvase.dao.SessionAbs;
import com.lotus.lotusvase.dao.interfaces.TratamientoDao;
import com.lotus.lotusvase.model.Tratamiento;
@Repository
@Transactional
public class TratamientoImp extends SessionAbs implements  TratamientoDao{

	@Override
	public void save(Tratamiento o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Tratamiento o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tratamiento findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tratamiento> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
