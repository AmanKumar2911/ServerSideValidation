package com.first.springvalidation.Entites;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class LoginData {

    @NotBlank(message = "email can not be empty !!")
    private String email;

    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$" , message = "1) a digit must occur at least once "+'\n'+" 2) a lower case letter must occur at least once"+'\n'+" 3) an upper case letter must occur at least once"+'\n'+" 4) a special character must occur at least once"+'\n'+" 5) no whitespace allowed in the entire string"+'\n'+" 6) anything, at least eight places though")
    private String password;

    @AssertTrue(message = "Must agree terms and conditions")
    private boolean agreed;

}
