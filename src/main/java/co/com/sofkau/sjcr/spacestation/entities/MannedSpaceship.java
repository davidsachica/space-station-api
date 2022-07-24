package co.com.sofkau.sjcr.spacestation.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_manned_spaceships")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MannedSpaceship extends Spaceship {

    /**
     * The number of passengers that can be transported by the spaceship.
     */
    @Column(name = "passenger_capacity")
    private int passengersCapacity;

    /**
     * Type of Purpose of the spaceship.
     */
    @Column(name = "purpose_type")
    @Enumerated(EnumType.STRING)
    private PurposeType purpose;

}
