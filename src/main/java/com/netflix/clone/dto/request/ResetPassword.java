package com.netflix.clone.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ResetPassword {

    @NotBlank
    private String token;

    @NotBlank
    @Size(min = 6,message = "new password must be 6 characters long")
    private String password;
}
