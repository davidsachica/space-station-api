package co.com.sofkau.sjcr.spacestation.controllers;

import co.com.sofkau.sjcr.spacestation.controllers.impl.BaseControllerImpl;
import co.com.sofkau.sjcr.spacestation.entities.ShuttleVehicle;
import co.com.sofkau.sjcr.spacestation.services.impl.ShuttleVehicleServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/spaceships/shuttle")
@Tag(name = "Shuttle Vehicle Controller", description = "Shuttle Vehicle Controller")
public class ShuttleVehicleController extends BaseControllerImpl<ShuttleVehicle, ShuttleVehicleServiceImpl> {
}
