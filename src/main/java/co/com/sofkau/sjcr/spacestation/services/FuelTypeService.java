package co.com.sofkau.sjcr.spacestation.services;

import co.com.sofkau.sjcr.spacestation.entities.FuelType;

import java.util.List;

public interface FuelTypeService {

    public List<FuelType> findAll();

    public FuelType findById(Long id);

}
