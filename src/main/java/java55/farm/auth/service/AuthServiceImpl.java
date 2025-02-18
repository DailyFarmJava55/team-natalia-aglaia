package java55.farm.auth.service;

import java55.farm.auth.dao.AccountRepository;
import java55.farm.auth.dto.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{
    final ModelMapper modelMapper;
    final AccountRepository accountRepository;

    @Override
    public FarmDto registerFarm(FarmRegisterDto farmRegisterDto) {
        return null;
    }

    @Override
    public UserDto registerUser(UserRegisterDto userRegisterDto) {
        return null;
    }

    @Override
    public AccountDto getAccountDto(String name) {
        return null;
    }

    @Override
    public FarmDto getFarmInfo(String id) {
        return null;
    }

    @Override
    public UserDto getUserInfo(String id) {
        return null;
    }

    @Override
    public FarmDto updateFarmInfo(String id, FarmRegisterDto farmRegisterDto) {
        return null;
    }

    @Override
    public UserDto updateUserInfo(String id, UserRegisterDto userRegisterDto) {
        return null;
    }

    @Override
    public AccountDto deleteAccount(String id) {
        return null;
    }
}
