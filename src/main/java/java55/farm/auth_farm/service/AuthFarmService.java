package java55.farm.auth_farm.service;

import java55.farm.auth_farm.dto.*;

public interface AuthFarmService {
    FarmDto registerFarm(FarmRegisterDto farmRegisterDto);
    FarmDto getFarmInfoByEmail(String id);
    FarmDto getFarmInfoById(String id);
    FarmDto updateFarmInfoById(String id, FarmUpdateDto farmRegisterDto);
}
