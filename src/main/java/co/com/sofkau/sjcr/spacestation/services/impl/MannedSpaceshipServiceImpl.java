package co.com.sofkau.sjcr.spacestation.services.impl;

import co.com.sofkau.sjcr.spacestation.entities.MannedSpaceship;
import co.com.sofkau.sjcr.spacestation.repository.BaseRepository;
import co.com.sofkau.sjcr.spacestation.repository.MannedSpaceshipRepository;
import co.com.sofkau.sjcr.spacestation.services.MannedSpaceshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MannedSpaceshipServiceImpl extends BaseServiceImpl<MannedSpaceship, Long> implements MannedSpaceshipService {

    @Autowired
    private MannedSpaceshipRepository mannedSpaceshipRepository;

    public MannedSpaceshipServiceImpl(BaseRepository<MannedSpaceship, Long> baseRepository) {
        super(baseRepository);
    }

}
