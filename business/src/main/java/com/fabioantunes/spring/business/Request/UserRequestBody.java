package com.fabioantunes.spring.business.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestBody {

    @NotEmpty(message = "")
    private String name;

    @Email
    @NotEmpty(message = "")
    private String email;

}
