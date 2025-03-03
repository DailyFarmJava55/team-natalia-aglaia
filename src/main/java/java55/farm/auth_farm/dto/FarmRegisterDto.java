package java55.farm.auth_farm.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java55.farm.auth_farm.model.Location;
import lombok.*;

import java.util.Locale;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FarmRegisterDto {

    @NotBlank(message = "Email is mandatory")
    @Email
    String email;
    String password;

    @NotBlank(message = "Name is mandatory")
    String farmName;
    Location location;
    @Setter
    Locale locale;


}

