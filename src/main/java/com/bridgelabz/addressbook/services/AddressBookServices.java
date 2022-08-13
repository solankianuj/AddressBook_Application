package com.bridgelabz.addressbook.services;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServices implements  IAddressBookServices{

    @Override
    public AddressBookModel seeAddressBook() {
        AddressBookDTO addressBookDTO=new AddressBookDTO();
        addressBookDTO.setFullName("Anuj Solanki");
        addressBookDTO.setAddress("vijay Nagar");
        addressBookDTO.setCity("Indore");
        addressBookDTO.setZipcode(465447);
        addressBookDTO.setState("MP");
        AddressBookModel addressBookModel=new AddressBookModel(7987359946l, addressBookDTO);

        return addressBookModel;
    }

    @Override
    public AddressBookModel addingAddress(AddressBookDTO addressBookDTO) {
        AddressBookModel addressBookModel=new AddressBookModel(7389829296l, addressBookDTO);

        return addressBookModel;
    }

    @Override
    public AddressBookModel updateAddress(long phoneNumber, AddressBookDTO addressBookDTO) {
        AddressBookModel addressBookModel=new AddressBookModel(phoneNumber, addressBookDTO);

        return addressBookModel;
    }

    @Override
    public AddressBookModel deleteAddress(long phoneNumber) {
        AddressBookDTO addressBookDTO=new AddressBookDTO();
        addressBookDTO.setFullName("Anuj Solanki");
        addressBookDTO.setAddress("vijay Nagar");
        addressBookDTO.setCity("Indore");
        addressBookDTO.setZipcode(465447);
        addressBookDTO.setState("MP");
        AddressBookModel addressBookModel=new AddressBookModel(phoneNumber, addressBookDTO);

        return addressBookModel;
    }
}
