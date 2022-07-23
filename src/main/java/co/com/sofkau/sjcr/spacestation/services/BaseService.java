package co.com.sofkau.sjcr.spacestation.services;

import co.com.sofkau.sjcr.spacestation.entities.Spaceship;

import java.util.List;

public interface BaseService<E extends Spaceship, ID extends Long> {

    public List<E> findAll() throws Exception;

    public E findById(ID id) throws Exception;

    public E save(E entity) throws Exception;

    public E update(ID id, E entity) throws Exception;

    public boolean delete(ID id) throws Exception;

}
