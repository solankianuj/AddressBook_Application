package com.bridgelabz.addressbook.services;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import org.springframework.web.bind.annotation.RequestBody;

public interface IAddressBookServices {
    AddressBookModel seeAddressBook();
    AddressBookModel addingAddress(AddressBookDTO addressBookDTO);
    AddressBookModel updateAddress(long phoneNumber ,AddressBookDTO addressBookDTO );
    AddressBookModel deleteAddress(long phoneNumber);
}
