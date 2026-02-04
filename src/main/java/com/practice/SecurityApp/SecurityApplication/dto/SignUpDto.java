package com.practice.SecurityApp.SecurityApplication.dto;

import com.practice.SecurityApp.SecurityApplication.entity.enums.Permission;
import com.practice.SecurityApp.SecurityApplication.entity.enums.Role;
import lombok.Data;

import java.util.Set;

@Data
public class SignUpDto {

    private String email;
    private String password;
    private String name;
    private Set<Role> roles;
    private Set<Permission> permissions;

}
