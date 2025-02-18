package java55.farm.auth.model;

import jakarta.persistence.Entity;
import java55.farm.auth.dto.AccountDto;
import java55.farm.auth.dto.AddressDto;
import java55.farm.auth.dto.OfferDto;
import lombok.*;

import java.util.Set;

@Getter
@NoArgsConstructor
@Setter
@Entity
public class Farm extends Account {
    Integer rating;
    Language language;
    @Singular
    Set<Offer> offers;
    Address address;

    public Farm(String login, Integer rating, Language language, Address address) {
        super(login);
        this.rating = rating;
        this.language = language;
        this.address = address;
    }
}

