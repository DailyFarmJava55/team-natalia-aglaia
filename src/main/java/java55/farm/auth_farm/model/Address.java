package java55.farm.auth_farm.model;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@Embeddable
public class Address implements Serializable {
    String country;
    String city;
    String street;
    String houseNumber;
    String zipCode;

}
