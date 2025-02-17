package java55.farm.auth.controller;

import java55.farm.auth.dto.*;
import java55.farm.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping ("/auth")
@RequiredArgsConstructor
public class AuthController {
    final AuthService authService;

    @PostMapping("/farm/register")
    public FarmDto registerFarm (@RequestBody FarmRegisterDto farmRegisterDto) {
        return authService.registerFarm (farmRegisterDto);
    }

    @PostMapping("/user/register")
    public UserDto registerFarm (@RequestBody UserRegisterDto userRegisterDto) {
        return authService.registerUser (userRegisterDto);
    }

    @PostMapping("/login")
    public AccountDto login(Principal principal){
        return authService.getAccountDto (principal.getName());
    }

    // TODO forget password

    @GetMapping ("/farm/{id}")
    public FarmDto getFarmInfo (@RequestParam String id) {
        return authService.getFarmInfo (id);
    }

    @GetMapping ("/user/{id}")
    public UserDto getUserInfo (@RequestParam String id) {
        return authService.getUserInfo (id);
    }

    @PutMapping ("/farm/{id}")
    public FarmDto updateFarmInfo (@RequestParam String id, @RequestBody FarmRegisterDto farmRegisterDto) {
        return authService.updateFarmInfo (id, farmRegisterDto);
    }

    @PutMapping ("/user/{id}")
    public UserDto updateUserInfo (@RequestParam String id, @RequestBody UserRegisterDto userRegisterDto) {
        return authService.updateUserInfo (id, userRegisterDto);
    }

    @DeleteMapping ("/{id}")
    public AccountDto deleteAccount (@RequestParam String id) {
        return authService.deleteAccount (id);
    }

}
