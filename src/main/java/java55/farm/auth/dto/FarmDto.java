package java55.farm.auth.dto;

import lombok.*;

import java.util.Locale;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class FarmDto extends AccountDto {

    Integer rating;
    @Singular
    Set<OfferDto> offers;
    AddressDto address;


    public FarmDto(String login, Locale language, String telephone, Integer rating, Set<OfferDto> offers, AddressDto address) {
        super(login, language, telephone);
        this.rating = rating;
        this.offers = offers;
        this.address = address;
    }
}

