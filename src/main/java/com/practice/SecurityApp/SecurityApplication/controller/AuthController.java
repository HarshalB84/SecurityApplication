package com.practice.SecurityApp.SecurityApplication.controller;

import com.practice.SecurityApp.SecurityApplication.dto.LoginDTO;
import com.practice.SecurityApp.SecurityApplication.dto.SignUpDTO;
import com.practice.SecurityApp.SecurityApplication.dto.UserDTO;
import com.practice.SecurityApp.SecurityApplication.service.AuthService;
import com.practice.SecurityApp.SecurityApplication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;
    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<UserDTO> signUp(@RequestBody SignUpDTO signUpDTO){
        UserDTO userDTO = userService.signUp(signUpDTO);
        return ResponseEntity.ok(userDTO);
    }

    @PostMapping
    public ResponseEntity<String> login(@RequestBody LoginDTO loginDTO){
        String token = authService.login(loginDTO);
        return ResponseEntity.ok(token);
    }


}
