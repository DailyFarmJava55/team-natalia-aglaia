package java55.farm.auth_farm.service;

import java55.farm.auth_farm.dao.FarmRepository;
import java55.farm.auth_farm.dto.exception.FarmExistException;
import java55.farm.auth_farm.dto.exception.FarmNotFoundException;
import java55.farm.auth_farm.model.Farm;
import java55.farm.auth_farm.dto.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthFarmServiceImpl implements AuthFarmService {
    final ModelMapper modelMapper;
    final FarmRepository farmRepository;
    final PasswordEncoder passwordEncoder;


    @Override
    public FarmDto registerFarm(FarmRegisterDto farmRegisterDto) {
        if (farmRepository.existsByEmail(farmRegisterDto.getEmail())){
            throw new FarmExistException();
        }
        Farm farm = modelMapper.map(farmRegisterDto, Farm.class);
        String password = passwordEncoder.encode(farmRegisterDto.getPassword());
        farm.setPassword(password);
        farmRepository.save(farm);
        return modelMapper.map(farm, FarmDto.class);
    }

    @Transactional(readOnly = true)
    @Override
    public FarmDto getFarmInfoByEmail(String email) {
        Farm farm = farmRepository.findByEmail(email).orElseThrow(FarmNotFoundException::new);
        return modelMapper.map(farm, FarmDto.class);

    }

    @Override
    public FarmDto updateFarmInfoByEmail(String email, FarmUpdateDto farmUpdateDto) {
        Farm farm = farmRepository.findByEmail(email).orElseThrow(FarmNotFoundException::new);
        if(farmUpdateDto.getEmail() != null) farm.setEmail(farmUpdateDto.getEmail());
        if(farmUpdateDto.getFarmName() != null) farm.setEmail(farmUpdateDto.getFarmName());
        if(farmUpdateDto.getLocation() != null) farm.setLocation(farmUpdateDto.getLocation());

        return modelMapper.map(farm, FarmDto.class);

    }

    @Override
    public FarmDto getFarmInfoById(String id) {

        Farm farm = farmRepository.findById(id).orElseThrow(FarmNotFoundException::new);
        return modelMapper.map(farm, FarmDto.class);
    }

    @Override
    public FarmDto updateFarmInfoById(String id, FarmUpdateDto farmUpdateDto) {

        Farm farm = farmRepository.findById(id).orElseThrow(FarmNotFoundException::new);
        if(farmUpdateDto.getEmail() != null) farm.setEmail(farmUpdateDto.getEmail());
        if(farmUpdateDto.getFarmName() != null) farm.setEmail(farmUpdateDto.getFarmName());
        if(farmUpdateDto.getLocation() != null) farm.setLocation(farmUpdateDto.getLocation());

        return modelMapper.map(farm, FarmDto.class);
    }


}
