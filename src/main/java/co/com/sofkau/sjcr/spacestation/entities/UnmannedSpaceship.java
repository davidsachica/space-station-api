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

    /**
     * Destination of the spaceship
     */
    @Column(name = "destination")
    private String destination;

    /**
     * Quantity of Motors of the spaceship
     */
    @Column(name = "quantity_motors")
    private int quantityMotors;

    /**
     * Push of the spaceship
     */
    @Column(name = "push")
    private double push;

}
