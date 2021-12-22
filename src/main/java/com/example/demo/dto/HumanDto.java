package com.example.demo.dto;
import lombok.*;


import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HumanDto {
    private int id;

    @NotBlank(message = "Name can't be null")
    private String name;

    @NotBlank(message = "Telephone can't be null")
    private String telephone;

    private int age;

    private String address;

}
