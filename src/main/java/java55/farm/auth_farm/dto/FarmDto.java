package java55.farm.auth_farm.dto;

import java55.farm.auth_farm.model.Location;
import java55.farm.auth_farm.model.Role;
import lombok.*;

import java.util.Locale;
import java.util.Set;

@Getter
@ToString
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FarmDto  {
    Long id;
    String email;
    String farmName;
    Set<Role> roles;
    Locale locale;
    Location location;
    Integer rating;
    @Singular
    Set<OfferDto> offers;

}

