package co.com.sofkau.sjcr.spacestation.repository;

import co.com.sofkau.sjcr.spacestation.entities.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelTypeRepository extends JpaRepository<FuelType, Long> {
}
