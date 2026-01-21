package com.practice.SecurityApp.SecurityApplication.controller;

import com.practice.SecurityApp.SecurityApplication.dto.SignUpDTO;
import com.practice.SecurityApp.SecurityApplication.dto.UserDTO;
import com.practice.SecurityApp.SecurityApplication.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<UserDTO> signUp(@RequestBody SignUpDTO signUpDTO){
        UserDTO userDTO = userService.signUp(signUpDTO);

        return ResponseEntity.ok(userDTO);
    }


}
