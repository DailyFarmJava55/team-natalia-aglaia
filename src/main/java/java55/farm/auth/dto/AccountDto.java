package java55.farm.auth.dto;

import java55.farm.auth.model.Language;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class AccountDto {
    String login;
    Language language;
    String telephone;
}
