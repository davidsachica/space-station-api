package co.com.sofkau.sjcr.spacestation.services.impl;

import co.com.sofkau.sjcr.spacestation.entities.FuelType;
import co.com.sofkau.sjcr.spacestation.repository.FuelTypeRepository;
import co.com.sofkau.sjcr.spacestation.services.FuelTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuelTypeServiceImpl implements FuelTypeService {

    @Autowired
    private FuelTypeRepository fuelTypeRepository;

    @Override
    public List<FuelType> findAll() {
        return fuelTypeRepository.findAll();
    }

    @Override
    public FuelType findById(Long id) {
        return fuelTypeRepository.findById(id).orElse(null);
    }

}
