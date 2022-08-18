package com.bridgelabz.addressbook.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-z A-Z \\s]{2,}$",message = "name is not valid")
    private String fullName;
    @NotEmpty(message = "Address cant be Empty")
    private String address;
    @NotEmpty(message = "City cant be Empty")
    private String city;
    @NotEmpty(message = "State cant be Empty")
    private String state;
//    @Pattern(regexp = "^[0-9]{6}",message = "zipcode Must be 6 digit")
    private int zipcode;
//    @Pattern(regexp = "^[6-9]{1}[0-9]{9}")
    private long phoneNumber;
}
