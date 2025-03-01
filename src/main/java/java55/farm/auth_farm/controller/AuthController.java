package java55.farm.auth_farm.controller;

import java55.farm.auth_farm.dto.FarmDto;
import java55.farm.auth_farm.dto.FarmRegisterDto;
import java55.farm.auth_farm.dto.FarmUpdateDto;
import java55.farm.auth_farm.service.AuthFarmService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Locale;

@RestController
@RequestMapping ("/api/auth/farm")
@RequiredArgsConstructor
public class AuthController {
    final AuthFarmService authService;

    @PostMapping("/register")
    public FarmDto registerFarm (
            @RequestBody FarmRegisterDto farmRegisterDto
//            ,@RequestHeader(value = "Accept-Language", defaultValue = "en-US") String localeHeader
    ){
//        Locale locale = Locale.forLanguageTag(localeHeader);
        //todo Сделать с фильтрами/ подключить конфиг
        Locale locale = LocaleContextHolder.getLocale();
        farmRegisterDto.setLocale(locale);
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

    @GetMapping ("/get/id/{id}")
    public FarmDto getFarmInfoById(@PathVariable String id) {
        return authService.getFarmInfoById(id);
    }

    @PutMapping ("/edit/id/{id}")
    public FarmDto updateFarmInfoById (@PathVariable String id, @RequestBody FarmUpdateDto farmRegisterDto) {
        return authService.updateFarmInfoById (id, farmRegisterDto);
    }

    @GetMapping ("/get/email/{email}")
    public FarmDto getFarmInfoByEmail(@PathVariable String email) {
        return authService.getFarmInfoByEmail(email);
    }

    @PutMapping ("/edit/email/{email}")
    public FarmDto updateFarmInfoByEmail (@PathVariable String email, @RequestBody FarmUpdateDto farmRegisterDto) {
        return authService.updateFarmInfoByEmail(email, farmRegisterDto);
    }


//    @DeleteMapping ("/{id}")
//    public boolean deleteAccount (@RequestParam String id) {
//        return authService.deleteAccount (id);
//    }

}
