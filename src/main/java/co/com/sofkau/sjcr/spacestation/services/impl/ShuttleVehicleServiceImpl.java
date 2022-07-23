package co.com.sofkau.sjcr.spacestation.services.impl;

import co.com.sofkau.sjcr.spacestation.entities.ShuttleVehicle;
import co.com.sofkau.sjcr.spacestation.repository.BaseRepository;
import co.com.sofkau.sjcr.spacestation.repository.ShuttleVehicleRepository;
import co.com.sofkau.sjcr.spacestation.services.ShuttleVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShuttleVehicleServiceImpl extends BaseServiceImpl<ShuttleVehicle, Long> implements ShuttleVehicleService {

    @Autowired
    private ShuttleVehicleRepository shuttleVehicleRepository;

    public ShuttleVehicleServiceImpl(BaseRepository<ShuttleVehicle, Long> baseRepository) {
        super(baseRepository);
    }

}
