package co.com.sofkau.sjcr.spacestation.controllers;

import co.com.sofkau.sjcr.spacestation.controllers.impl.BaseControllerImpl;
import co.com.sofkau.sjcr.spacestation.entities.ShuttleVehicle;
import co.com.sofkau.sjcr.spacestation.services.impl.ShuttleVehicleServiceImpl;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/spaceships/shuttle")
@Tag(name = "Shuttle Vehicle Controller")
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successful operation", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = ShuttleVehicle.class))}),
        @ApiResponse(responseCode = "400", description = "Bad request", content = @Content),
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content),
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content),
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)})
public class ShuttleVehicleController extends BaseControllerImpl<ShuttleVehicle, ShuttleVehicleServiceImpl> {
}
