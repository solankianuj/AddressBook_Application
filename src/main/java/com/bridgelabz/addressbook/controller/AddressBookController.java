package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import com.bridgelabz.addressbook.services.IAddressBookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("addressbook")
public class AddressBookController {

        @Autowired
        IAddressBookServices iAddressBookServices;
        @GetMapping(value = { "","/","/home"})
        public List<AddressBookModel> seeAddressBook(){

           return iAddressBookServices.seeAddressBook();
        }



        @RequestMapping(value = "/creatingAddress" )
        public AddressBookModel addingAddress(@RequestBody AddressBookDTO addressBookDTO) {

           return iAddressBookServices.addingAddress(addressBookDTO);

        }

        @PutMapping("/updateAdress")
        public AddressBookModel updateAddress(@RequestBody AddressBookDTO addressBookDTO , @RequestParam(value = "id") int id) {

           return iAddressBookServices.updateAddress(id,addressBookDTO);
        }

        @DeleteMapping("/deleteAddress/{phoneNumber}")
        public  List<AddressBookModel>  deleteAddress(@PathVariable long phoneNumber) {

            return iAddressBookServices.deleteAddress(phoneNumber);
    }

}
