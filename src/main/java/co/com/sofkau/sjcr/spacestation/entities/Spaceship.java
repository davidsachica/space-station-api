package co.com.sofkau.sjcr.spacestation.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Spaceship {

    /**
     * The id of the spaceship.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The name of the spaceship.
     */
    private String name;

    /**
     * The country of the spaceship.
     */
    private String country;

    /**
     * The launch date of the spaceship.
     */
    @Column(name = "launch_date")
    @Temporal(TemporalType.DATE)
    private Date launchDate;

    /**
     * The speed of the spaceship.
     */
    private double speed;

    /**
     * The fuelType of the spaceship.
     */
    @NotNull(message = "The fuelType is required")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fuelType_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private FuelType fuelType;

    /**
     * The weight of the spaceship.
     */
    private double weight;

    /**
     * The height of the spaceship.
     */
    private double height;

}
