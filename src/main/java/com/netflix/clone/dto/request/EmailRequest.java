package com.netflix.clone.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailRequest {
    @NotBlank(message = "email is required")
    @Email(message = "invalid email")
    private String email;


}
