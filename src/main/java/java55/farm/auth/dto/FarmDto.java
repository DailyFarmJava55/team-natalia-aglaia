package java55.farm.auth.dto;

import java55.farm.auth.model.Language;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class FarmDto extends AccountDto {

    Integer rating;
    @Singular
    Set<OfferDto> offers;
    AddressDto address;


    public FarmDto(String login, Language language, String telephone, Integer rating, Set<OfferDto> offers, AddressDto address) {
        super(login, language, telephone);
        this.rating = rating;
        this.offers = offers;
        this.address = address;
    }
}

