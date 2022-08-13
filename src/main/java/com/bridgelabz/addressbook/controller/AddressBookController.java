package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import com.bridgelabz.addressbook.services.IAddressBookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("addressbook")
public class AddressBookController {

        @Autowired
        IAddressBookServices iAddressBookServices;
        @GetMapping(value = { "","/","/home"})
        public AddressBookModel seeAddressBook(){

           return iAddressBookServices.seeAddressBook();
        }



        @PostMapping("/creatingAddress")
        public AddressBookModel adddingAddress(@RequestBody AddressBookDTO addressBookDTO) {

           return iAddressBookServices.addingAddress(addressBookDTO);

        }

        @PutMapping("/updateAdress")
        public AddressBookModel updateAddress(@RequestBody AddressBookDTO addressBookDTO , @RequestParam(value = "phoneNumber") long phoneNumber) {

           return iAddressBookServices.updateAddress(phoneNumber,addressBookDTO);
        }

        @DeleteMapping("/deleteAddress/{phoneNumber}")
        public AddressBookModel deleteAddress(@PathVariable long phoneNumber) {

            return iAddressBookServices.deleteAddress(phoneNumber);
    }

}
