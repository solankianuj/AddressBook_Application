package com.bridgelabz.addressbook.services;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IAddressBookServices {
        List<AddressBookModel> seeAddressBook();
        AddressBookModel addingAddress(AddressBookDTO addressBookDTO);
        AddressBookModel updateAddress(int id ,AddressBookDTO addressBookDTO );
        AddressBookModel getAddress(int id);
         void deleteAddress(int id);
}
