package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import com.bridgelabz.addressbook.services.IAddressBookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

        @PostMapping(value = "/creatingAddress" )
        public AddressBookModel addingAddress(@Valid @RequestBody AddressBookDTO addressBookDTO) {

           return iAddressBookServices.addingAddress(addressBookDTO);

        }
        @GetMapping(value = { "/getaddress/{id}"})
        public AddressBookModel seeAddressBook(@PathVariable int id){

            return iAddressBookServices.getAddress(id);
        }


        @PutMapping("/updateAdress")
        public AddressBookModel updateAddress(@RequestBody AddressBookDTO addressBookDTO , @RequestParam(value = "id") int id) {

           return iAddressBookServices.updateAddress(id,addressBookDTO);
        }

        @DeleteMapping("/deleteAddress/{id}")
        public  void deleteAddress(@PathVariable int id) {

             iAddressBookServices.deleteAddress(id);
    }

}
