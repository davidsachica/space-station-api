package co.com.sofkau.sjcr.spacestation.controllers;

import co.com.sofkau.sjcr.spacestation.controllers.impl.BaseControllerImpl;
import co.com.sofkau.sjcr.spacestation.entities.MannedSpaceship;
import co.com.sofkau.sjcr.spacestation.services.impl.MannedSpaceshipServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/spaceships/manned")
@Tag(name = "Manned Spaceship Controller", description = "Manned Spaceship Controller")
public class MannedSpaceshipController extends BaseControllerImpl<MannedSpaceship, MannedSpaceshipServiceImpl> {
}
