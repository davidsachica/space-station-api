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

    @Column(name = "passenger_capacity")
    private int passengersCapacity;

    @Column(name = "purpose_type")
    @Enumerated(EnumType.STRING)
    private PurposeType purpose;

}
