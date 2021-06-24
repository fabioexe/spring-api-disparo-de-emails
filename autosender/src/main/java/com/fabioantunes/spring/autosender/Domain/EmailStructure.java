package com.fabioantunes.spring.autosender.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class EmailStructure {

    @NotNull
    public String name;

    @NotNull
    public String email;

    @NotNull
    @Min(10)
    public String content;
}
