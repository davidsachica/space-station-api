package co.com.sofkau.sjcr.spacestation.services.impl;

import co.com.sofkau.sjcr.spacestation.entities.UnmannedSpaceship;
import co.com.sofkau.sjcr.spacestation.repository.BaseRepository;
import co.com.sofkau.sjcr.spacestation.repository.UnmannedSpaceshipRepository;
import co.com.sofkau.sjcr.spacestation.services.UnmannedSpaceshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnmannedSpaceshipServiceImpl extends BaseServiceImpl<UnmannedSpaceship, Long> implements UnmannedSpaceshipService {

    @Autowired
    private UnmannedSpaceshipRepository unmannedSpaceshipRepository;

    public UnmannedSpaceshipServiceImpl(BaseRepository<UnmannedSpaceship, Long> baseRepository) {
        super(baseRepository);
    }

}
