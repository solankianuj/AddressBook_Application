package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import lombok.Data;

@Data
public class AddressBookModel {
    private String fullName;
    private String address;
    private String city;
    private String state;
    private int zipcode;
    private long phoneNumber;

    public AddressBookModel(long phoneNumber, AddressBookDTO addressBookDTO) {
        this.phoneNumber=phoneNumber;
        this.fullName = addressBookDTO.getFullName();
        this.address = addressBookDTO.getAddress();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
        this.zipcode = addressBookDTO.getZipcode();
    }
}
