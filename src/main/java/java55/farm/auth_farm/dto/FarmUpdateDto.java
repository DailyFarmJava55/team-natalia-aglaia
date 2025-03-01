package java55.farm.auth_farm.dto;

import java55.farm.auth_farm.model.Location;
import lombok.*;

import java.util.Locale;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FarmUpdateDto {
    String email;
    String farmName;
    Location location;

}

