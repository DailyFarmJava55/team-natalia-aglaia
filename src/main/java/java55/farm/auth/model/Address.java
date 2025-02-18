package java55.farm.auth.model;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@Embeddable
public class Address implements Serializable {
    String city;
    String street;
    int building;
    double latitude;
    double longitude;

}
