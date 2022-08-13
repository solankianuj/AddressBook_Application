package com.bridgelabz.addressbook.dto;

import lombok.Data;

@Data
public class AddressBookDTO {

    private String fullName;
    private String address;
    private String city;
    private String state;
    private int zipcode;
}
