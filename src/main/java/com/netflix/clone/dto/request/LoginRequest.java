package com.netflix.clone.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank(message = "email should be provided")
    @Email(message = "invalid email")
    private String email;

    @NotBlank(message = "password is required")
    private String password;
}
