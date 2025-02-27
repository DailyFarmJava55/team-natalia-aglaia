package java55.farm.auth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Locale;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class Account {
    @Id
    String login;
    @Setter
    String password;
    Locale locale;
    List<Role> roles;

}
