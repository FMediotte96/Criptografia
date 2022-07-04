package com.example.rabbit.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class RabbitRequest {
    private String picture;
    @NotEmpty private String key;
    private String iv;
    @NotNull private Option option;
}
