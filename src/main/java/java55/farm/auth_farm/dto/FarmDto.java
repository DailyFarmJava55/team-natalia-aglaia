package java55.farm.auth_farm.dto;

import java55.farm.auth_farm.model.Location;
import java55.farm.auth_farm.model.Role;
import lombok.*;

import java.util.Locale;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FarmDto  {
     String email;
     String farmName;
     Role role;
    Locale language;
    Location location;
    Integer rating;
    @Singular
    Set<OfferDto> offers;

}

