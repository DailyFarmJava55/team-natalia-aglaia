package java55.farm.auth_farm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.*;

@Getter
@NoArgsConstructor
@Setter
@Entity
public class Farm  {

    @Id
    String login;
    @Setter
    String password;
    Locale locale;
    List<Role> roles;

    Integer rating;
    @Singular
    Set<Offer> offers;
    Address address;

}

