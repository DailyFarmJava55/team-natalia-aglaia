package java55.farm.auth.service;

import java55.farm.auth.dto.*;

public interface AuthService {

    FarmDto registerFarm(FarmRegisterDto farmRegisterDto);

    UserDto registerUser(UserRegisterDto userRegisterDto);

    AccountDto getAccountDto(String name);

    FarmDto getFarmInfo(String id);

    UserDto getUserInfo(String id);

    FarmDto updateFarmInfo(String id, FarmRegisterDto farmRegisterDto);

    UserDto updateUserInfo(String id, UserRegisterDto userRegisterDto);

    AccountDto deleteAccount(String id);
}
