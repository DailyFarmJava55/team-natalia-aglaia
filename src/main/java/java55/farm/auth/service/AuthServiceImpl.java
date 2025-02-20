package java55.farm.auth.service;

import java55.farm.auth.dao.AccountRepository;
import java55.farm.auth.dto.*;
import java55.farm.auth.dto.exception.AccountNotFoundException;
import java55.farm.auth.model.Account;
import java55.farm.auth.model.Farm;
import java55.farm.auth.model.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional(readOnly = true)
    @Override
    public AccountDto getAccountDto(String name) {
        //TODO PRINCIPAL
        Account account = accountRepository.findById(name).orElseThrow(AccountNotFoundException::new);
        return modelMapper.map(account, AccountDto.class);
    }

    @Transactional(readOnly = true)
    @Override
    public FarmDto getFarmInfo(String id) {
        Farm farm = (Farm) accountRepository.findById(id).orElseThrow(AccountNotFoundException::new);
        return modelMapper.map(farm, FarmDto.class);

    }

    @Transactional(readOnly = true)
    @Override
    public UserDto getUserInfo(String id) {
        User user = (User) accountRepository.findById(id).orElseThrow(AccountNotFoundException::new);
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public FarmDto updateFarmInfo(String id, FarmRegisterDto farmRegisterDto) {
        //TODO
        return null;
    }

    @Override
    public UserDto updateUserInfo(String id, UserRegisterDto userRegisterDto) {
        //TODO
        return null;
    }

    @Override
    public AccountDto deleteAccount(String id) {
        Account account = accountRepository.findById(id).orElseThrow(AccountNotFoundException::new);
        accountRepository.delete(account);
        return modelMapper.map(account, AccountDto.class);
    }
}
