package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("addressbook")
public class AddressBookController {
    @GetMapping(value = { "","/","/home"})
    public AddressBookModel seeAddressBook(){
        AddressBookDTO addressBookDTO=new AddressBookDTO();
        addressBookDTO.setFullName("Anuj Solanki");
        addressBookDTO.setAddress("vijay Nagar");
        addressBookDTO.setCity("Indore");
        addressBookDTO.setZipcode(465447);
        addressBookDTO.setState("MP");
        AddressBookModel addressBookModel=new AddressBookModel(7987359946l, addressBookDTO);

        return addressBookModel;
    }

    @RequestMapping(value = {"/address"}, method = RequestMethod.GET)
    public AddressBookModel seeAddress(@RequestParam(value = "phoneNumber") long phoneNumber){

        AddressBookDTO addressBookDTO=new AddressBookDTO();
        addressBookDTO.setFullName("Rahul Solanki");
        addressBookDTO.setAddress("vijay Nagar");
        addressBookDTO.setCity("Indore");
        addressBookDTO.setZipcode(465447);
        addressBookDTO.setState("MP");
        AddressBookModel addressBookModel=new AddressBookModel(phoneNumber, addressBookDTO);

        return addressBookModel;    }

        @GetMapping("/addressOF/{phoneNumber}")
        public AddressBookModel seeAddressOF(@PathVariable long phoneNumber){
            AddressBookDTO addressBookDTO=new AddressBookDTO();
            addressBookDTO.setFullName("Anuj Solanki");
            addressBookDTO.setAddress("vijay Nagar");
            addressBookDTO.setCity("Indore");
            addressBookDTO.setZipcode(465447);
            addressBookDTO.setState("MP");
            AddressBookModel addressBookModel=new AddressBookModel(phoneNumber, addressBookDTO);

            return addressBookModel;         }

        @PostMapping("/creatingAddress")
        public AddressBookModel adddingAddress(@RequestBody AddressBookDTO addressBookDTO) {

            AddressBookModel addressBookModel=new AddressBookModel(7389829296l, addressBookDTO);

            return addressBookModel;         }

        @PutMapping("/updateAdress")
        public AddressBookModel updateAddress(@RequestBody AddressBookDTO addressBookDTO , @RequestParam(value = "phoneNumber") long phoneNumber) {
            AddressBookModel addressBookModel=new AddressBookModel(7389829296l, addressBookDTO);

            return addressBookModel;          }

        @DeleteMapping("/deleteAddress/{phoneNumber}")
        public AddressBookModel deleteAddress(@PathVariable long phoneNumber) {
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
