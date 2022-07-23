package co.com.sofkau.sjcr.spacestation.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_unmanned_spaceship")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UnmannedSpaceship extends Spaceship {

    @Column(name = "destination")
    private String destination;

    @Column(name = "quantity_motors")
    private int quantityMotors;

    @Column(name = "push")
    private double push;

}
