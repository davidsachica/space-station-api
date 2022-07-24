package co.com.sofkau.sjcr.spacestation.controllers;

import co.com.sofkau.sjcr.spacestation.controllers.impl.BaseControllerImpl;
import co.com.sofkau.sjcr.spacestation.entities.UnmannedSpaceship;
import co.com.sofkau.sjcr.spacestation.services.impl.UnmannedSpaceshipServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/spaceships/unmanned")
@Tag(name = "Unmanned Spaceship Controller", description = "Unmanned Spaceship Controller")
public class UnmannedSpaceshipController extends BaseControllerImpl<UnmannedSpaceship, UnmannedSpaceshipServiceImpl> {
}
