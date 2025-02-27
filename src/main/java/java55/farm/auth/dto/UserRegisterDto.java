package java55.farm.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Locale;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRegisterDto {
    String login;
    String password;
    String telephone;
    Locale language;
}
