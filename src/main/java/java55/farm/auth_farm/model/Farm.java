package java55.farm.auth_farm.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.*;

@Getter
@ToString
@NoArgsConstructor
@Setter
@Entity
@Table(indexes = {
        @Index(name = "email_inx", columnList = "email")
})

public class Farm  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    String email;

    @Setter
    String password;

    String farmName;

    @ElementCollection(fetch = FetchType.EAGER)
    Set<Role> roles;

    Locale locale;

    @Embedded
    Location location;

    Integer rating;

    @Singular
    Set<Offer> offers;

    {
        roles = new HashSet<>();
        roles.add(Role.FARMER);

        rating = 0;
    }
}

