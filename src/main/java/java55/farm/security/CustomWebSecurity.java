package java55.farm.security;


import java55.farm.auth_farm.dao.FarmRepository;
import java55.farm.auth_farm.model.Farm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// для проверки авторства поста

@Service("webSecurity")
@RequiredArgsConstructor
public class CustomWebSecurity {
    final FarmRepository farmRepository;


    public boolean checkFarmLoginById(String farmId, String login) {
        Farm farm = farmRepository.findById(farmId).orElse(null);
        return farm != null && farm.getEmail().equalsIgnoreCase(login);
    }
}
