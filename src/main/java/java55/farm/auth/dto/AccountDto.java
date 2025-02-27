package java55.farm.auth.dto;

import lombok.*;

import java.util.Locale;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class AccountDto {
    String login;
    Locale language;
    String telephone;
}
