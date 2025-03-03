package telran.java55.auth.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import telran.java55.auth.dto.UserDto;
import telran.java55.auth.service.UserService;

@RestController
@RequiredArgsConstructor

public class UserController {
	final UserService userService = null; 
	
	@PostMapping ("/user")
	public Boolean addUser (@RequestBody UserDto userDto) {
return userService.addUser (userDto);
	}
}
