package java55.farm.auth_farm.controller;

import java55.farm.auth_farm.dto.FarmDto;
import java55.farm.auth_farm.dto.FarmRegisterDto;
import java55.farm.auth_farm.service.AuthFarmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping ("/auth/farm")
@RequiredArgsConstructor
public class AuthController {
    final AuthFarmService authService;

    @PostMapping("/register")
    public FarmDto registerFarm (@RequestBody FarmRegisterDto farmRegisterDto) {
        return authService.registerFarm (farmRegisterDto);
    }

    @PostMapping("/login")
    public FarmDto login(Principal principal){
//        return authService.getFarmDto (principal.getName());
        // TODO login
        return null;
    }


    @PostMapping("/logout")
        public FarmDto logout(Principal principal){
//            return authService.
        // TODO logout
        return null;
        }

    @GetMapping ("/{id}")
    public FarmDto getFarmInfo (@RequestParam String id) {
        return authService.getFarmInfo (id);
    }

    @PutMapping ("/farm/{id}")
    public FarmDto updateFarmInfo (@RequestParam String id, @RequestBody FarmRegisterDto farmRegisterDto) {
        return authService.updateFarmInfo (id, farmRegisterDto);
    }

//    @DeleteMapping ("/{id}")
//    public boolean deleteAccount (@RequestParam String id) {
//        return authService.deleteAccount (id);
//    }

}
