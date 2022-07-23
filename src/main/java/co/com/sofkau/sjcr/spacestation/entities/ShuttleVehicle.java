package co.com.sofkau.sjcr.spacestation.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_shuttle_vehicles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ShuttleVehicle extends Spaceship {

    @Column(name = "push")
    private double push;

    @Column(name = "capacity_load")
    private double capacityLoad;

    @Column(name = "power")
    private double power;

}
