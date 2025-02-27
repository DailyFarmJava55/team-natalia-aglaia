package java55.farm.auth_farm.service;

import java55.farm.auth_farm.dao.FarmRepository;
import java55.farm.auth_farm.dto.exception.AccountNotFoundException;
import java55.farm.auth_farm.model.Farm;
import java55.farm.auth_farm.dto.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthFarmServiceImpl implements AuthFarmService {
    final ModelMapper modelMapper;
    final FarmRepository farmRepository;

    @Override
    public FarmDto registerFarm(FarmRegisterDto farmRegisterDto) {
        if (farmRepository.existsById(farmRegisterDto.getEmail())){
            return null;
        }
        Farm farm = modelMapper.map(farmRegisterDto, Farm.class);
        farmRepository.save(farm);
        return modelMapper.map(farm, FarmDto.class);
    }

    @Transactional(readOnly = true)
    @Override
    public FarmDto getFarmInfo(String id) {
        Farm farm = farmRepository.findById(id).orElseThrow(AccountNotFoundException::new);
        return modelMapper.map(farm, FarmDto.class);

    }

    @Override
    public FarmDto updateFarmInfo(String id, FarmRegisterDto farmRegisterDto) {
        //TODO
        return null;
    }


}
