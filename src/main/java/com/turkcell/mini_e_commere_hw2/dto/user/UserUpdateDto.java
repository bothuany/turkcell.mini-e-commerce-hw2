package com.turkcell.mini_e_commere_hw2.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateDto {
    private String name;
    private String surname;
    private String password;
} 