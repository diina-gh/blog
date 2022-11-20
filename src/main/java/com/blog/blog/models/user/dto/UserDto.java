package com.blog.blog.models.user.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.blog.blog.models._abstract.enums.CivilityEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    @NotBlank
    private CivilityEnum civility;

    @NotBlank
    @Size(min = 2, max = 160)
    private String firstname;

    @NotBlank
    @Size(min = 2, max = 160)
    private String lastname;

    @NotBlank
    @Size(max = 100)
    @Email
    private String email;

    @NotBlank
    @Size(min = 10)
    private String phoneNumber;

    @NotBlank
    @Size(min = 8 , max = 24)
    private String password;

    @NotBlank
    @Size(min = 8 , max = 24)
    private String confirmPassword;
    
}
