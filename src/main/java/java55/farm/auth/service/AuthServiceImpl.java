package java55.farm.auth.service;

import java55.farm.auth.dao.AccountRepository;
import java55.farm.auth.dto.*;
import java55.farm.auth.model.Farm;
import java55.farm.auth.model.User;
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
        if (accountRepository.existsById(farmRegisterDto.getLogin())){
            return null;
        }
        Farm farm = modelMapper.map(farmRegisterDto, Farm.class);
        accountRepository.save(farm);
        return modelMapper.map(farm, FarmDto.class);
    }

    @Override
    public UserDto registerUser(UserRegisterDto userRegisterDto) {
        if (accountRepository.existsById(userRegisterDto.getLogin())){
            return null;
        }
        User user = modelMapper.map(userRegisterDto, User.class);
        accountRepository.save(user);
        return modelMapper.map(user, UserDto.class);
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
