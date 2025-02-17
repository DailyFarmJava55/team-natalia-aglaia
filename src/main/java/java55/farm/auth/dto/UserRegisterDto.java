package java55.farm.auth.dto;

import java55.farm.auth.model.Language;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRegisterDto {
    String login;
    String password;
    String telephone;
    Language language;
}
