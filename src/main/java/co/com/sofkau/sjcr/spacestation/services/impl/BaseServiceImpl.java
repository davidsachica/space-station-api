package co.com.sofkau.sjcr.spacestation.services.impl;

import co.com.sofkau.sjcr.spacestation.entities.FuelType;
import co.com.sofkau.sjcr.spacestation.entities.Spaceship;
import co.com.sofkau.sjcr.spacestation.repository.BaseRepository;
import co.com.sofkau.sjcr.spacestation.services.BaseService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Spaceship, ID extends Long> implements BaseService<E, ID> {

    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try {
            List<E> entities = baseRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            if (entityOptional.isPresent()) {
                return entityOptional.get();
            } else {
                throw new Exception("No se encontró el registro");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            entity = baseRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            E entityUpdate = entityOptional.get();
            entityUpdate = baseRepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (baseRepository.existsById(id)) {
                baseRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public List<E> findByFuelType(FuelType fuelType) throws Exception {
        try {
            List<E> entities = baseRepository.findByFuelType(fuelType);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
