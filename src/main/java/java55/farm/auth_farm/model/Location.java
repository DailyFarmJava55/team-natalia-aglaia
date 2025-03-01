package java55.farm.auth_farm.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Location implements Serializable {
    double latitude;
    double longitude;
}
