package java55.farm.auth.dto;

import java55.farm.auth.model.Language;
import lombok.*;

import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FarmDto extends AccountDto {
    String login;
    Integer rating;
    Language language;
    @Singular
    Set<OfferDto> offers;
    AddressDto address;


}

