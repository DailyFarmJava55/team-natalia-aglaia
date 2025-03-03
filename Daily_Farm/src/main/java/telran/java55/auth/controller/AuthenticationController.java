package telran.java55.auth.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import telran.java55.auth.service.AuthenticationService;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        return authenticationService.authenticate(email, password);
    }
}