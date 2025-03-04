package java55.farm.auth_farm.controller;

import java55.farm.auth_farm.dto.FarmDto;
import java55.farm.auth_farm.dto.FarmRegisterDto;
import java55.farm.auth_farm.dto.FarmUpdateDto;
import java55.farm.auth_farm.service.AuthFarmService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RestController
@RequestMapping ("/api/auth/farm")
@RequiredArgsConstructor
public class AuthController {
    final AuthFarmService authFarmService;

    @PostMapping("/register")
    public FarmDto registerFarm (
            @RequestBody @Validated FarmRegisterDto farmRegisterDto
//            ,@RequestHeader(value = "Accept-Language", defaultValue = "en-US") String localeHeader
    ){
//        Locale locale = Locale.forLanguageTag(localeHeader);
        //todo Сделать с фильтрами/ подключить конфиг
        Locale locale = LocaleContextHolder.getLocale();
        farmRegisterDto.setLocale(locale);
        return authFarmService.registerFarm (farmRegisterDto);
    }

    @PostMapping("/login")
    public FarmDto login(Principal principal){
        String name = principal.getName();
//        return authService.getFarmDto (principal.getName());
        // TODO login
        return authFarmService.getFarmInfoByEmail(name);
    }


    @PostMapping("/logout")
        public FarmDto logout(Principal principal){
//            return authService.
        // TODO logout
        return null;
        }

    @GetMapping ("/get/id/{id}")
    public FarmDto getFarmInfoById(@PathVariable String id) {
        return authFarmService.getFarmInfoById(id);
    }

    @PutMapping ("/edit/id/{id}")
    public FarmDto updateFarmInfoById (@PathVariable String id, @RequestBody FarmUpdateDto farmRegisterDto) {
        return authFarmService.updateFarmInfoById (id, farmRegisterDto);
    }

    @GetMapping ("/get/email/{email}")
    public FarmDto getFarmInfoByEmail(@PathVariable String email) {
        return authFarmService.getFarmInfoByEmail(email);
    }

    @PutMapping ("/edit/email/{email}")
    public FarmDto updateFarmInfoByEmail (@PathVariable String email, @RequestBody FarmUpdateDto farmRegisterDto) {
        return authFarmService.updateFarmInfoByEmail(email, farmRegisterDto);
    }


//    @DeleteMapping ("/{id}")
//    public boolean deleteAccount (@RequestParam String id) {
//        return authService.deleteAccount (id);
//    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
