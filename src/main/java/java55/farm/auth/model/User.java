package java55.farm.auth.model;

import jakarta.persistence.Entity;
import java55.farm.auth.dto.AccountDto;
import lombok.*;

@Getter
@NoArgsConstructor
@Setter
@Entity
public class User extends Account {

    String telephone;
    Language language;

    public User(String login, String telephone, Language language) {
        super(login);
        this.telephone = telephone;
        this.language = language;
    }
}
