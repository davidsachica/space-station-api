package co.com.sofkau.sjcr.spacestation.repository;

import co.com.sofkau.sjcr.spacestation.entities.FuelType;
import co.com.sofkau.sjcr.spacestation.entities.Spaceship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface BaseRepository<E extends Spaceship, ID extends Long> extends JpaRepository<E, ID> {

    public List<E> findByFuelType(FuelType fuelType);

}
