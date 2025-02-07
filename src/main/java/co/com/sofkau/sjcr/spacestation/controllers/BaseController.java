package co.com.sofkau.sjcr.spacestation.controllers;

import co.com.sofkau.sjcr.spacestation.entities.Spaceship;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface BaseController<E extends Spaceship, ID extends Long> {

    public ResponseEntity<?> getAll(@RequestParam(value = "fuelTypeId", required = false) Long fuelTypeId);

    public ResponseEntity<?> getOne(@PathVariable ID id);

    public ResponseEntity<?> save(@RequestBody E entity);

    public ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);

    public ResponseEntity<?> delete(@PathVariable ID id);

}
