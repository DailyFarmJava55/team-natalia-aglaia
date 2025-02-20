package java55.farm.auth.model;

import jakarta.persistence.Entity;
import java55.farm.auth.dto.AccountDto;
import java55.farm.auth.dto.AddressDto;
import java55.farm.auth.dto.OfferDto;
import lombok.*;

import java.util.*;

@Getter
@NoArgsConstructor
@Setter
@Entity
public class Farm extends Account {
    Integer rating;
    @Singular
    Set<Offer> offers;
    Address address;

    public Farm(String login, String password, Language language, Address address) {
        super(login, password, language, new ArrayList<>(List.of(Role.FARMER)));
        offers = new HashSet<>();
        rating = 0;
        this.address = address;
    }
}

