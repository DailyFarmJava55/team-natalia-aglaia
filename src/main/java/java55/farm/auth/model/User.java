package java55.farm.auth.model;

import jakarta.persistence.Entity;
import java55.farm.auth.dto.AccountDto;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Getter
@NoArgsConstructor
@Setter
@Entity
public class User extends Account {

    String telephone;

    public User(String login, String password, Language language, String telephone) {
        super(login, password, language, new ArrayList<>(List.of(Role.USER)) {
        });
        this.telephone = telephone;
    }
}
