package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "addressbook")
@Data
public class AddressBookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;
    private String fullName;
    private String address;
    private String city;
    private String state;
    private int zipcode;
    private long phoneNumber;

    public AddressBookModel(AddressBookDTO addressBookDTO) {
        this.addressId=addressId;
        this.phoneNumber=addressBookDTO.getPhoneNumber();
        this.fullName = addressBookDTO.getFullName();
        this.address = addressBookDTO.getAddress();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
        this.zipcode = addressBookDTO.getZipcode();
    }

    public AddressBookModel() {

    }
}
