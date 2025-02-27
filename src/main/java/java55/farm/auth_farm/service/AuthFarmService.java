package java55.farm.auth_farm.service;

import java55.farm.auth_farm.dto.*;

public interface AuthFarmService {
    FarmDto registerFarm(FarmRegisterDto farmRegisterDto);

    FarmDto getFarmInfo(String id);

    FarmDto updateFarmInfo(String id, FarmRegisterDto farmRegisterDto);

}
