package com.Centum.Sharathcars.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SharathcarRequest {
    @NotNull(message ="carcode should be blank")
    public String carcode;
    @NotBlank
    public String carname;
    @NotBlank
    public String carmodel;
    @NotBlank
    public String caryear;
    @NotBlank
    public String carcolour;
    @NotBlank
    public String carvin;
    @NotBlank
    public String carowner;
    @NotEmpty
    public String state;
    @Pattern(regexp ="^\\d{10}$",message="invaild mobile number entered")
    public String mobilenumber;
    @Min(100000)
    @Max(10000000)
    public String price;
    @NotBlank
    public String details;
}
