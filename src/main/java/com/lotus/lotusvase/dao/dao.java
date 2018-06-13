package com.lotus.lotusvase.dao;

import java.util.List;

public interface dao <O, i> {

    void save(O o);

    void update(O o);

    void deleteById(i id);

    O findById(i id);
    
    List<O> findAll();
	
}
