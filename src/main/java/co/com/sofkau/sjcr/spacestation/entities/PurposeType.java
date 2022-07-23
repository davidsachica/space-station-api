package co.com.sofkau.sjcr.spacestation.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PurposeType {
    LUNAR_MISSION("Lunar Mission"),
    HUMAN_BEHAVIOR("Human Behavior"),
    SATELLITES_MAINTENANCE("Satellites Maintenance");

    private String description;

}
