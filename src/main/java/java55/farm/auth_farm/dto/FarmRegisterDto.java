package java55.farm.auth_farm.dto;

import java55.farm.auth_farm.model.Location;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Locale;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FarmRegisterDto {
    String email;
    String farmName;
    String password;
    Locale language;
    Location location;

}

