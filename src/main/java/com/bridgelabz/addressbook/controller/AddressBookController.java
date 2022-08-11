package com.bridgelabz.addressbook.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("addressbook")
public class AddressBookController {
    @GetMapping(value = { "","/","/home"})
    public String seeAddressBook(){
        return "Looking into Address Book ";
    }

    @RequestMapping(value = {"/address"}, method = RequestMethod.GET)
    public String seeAddressBook(@RequestParam(value = "addressId") int addressId){
        return "Looking Address Of Address Id -: "+" " +addressId;
    }

    @GetMapping("/addressOF/{name}")
    public String seeAddressBook(@PathVariable String name){
        return "Looking Address Of "+name+"!";
    }

    @PostMapping("/creatingAddress")
    public String adddingAddress() {
        return "Adding Address in Address Book";
    }

    @PutMapping("/updateAdress")
    public String updateAddress(@RequestParam(value = "id") int id) {
        return "Updating Address in Address Book Of Address Id  "+id;
    }

    @DeleteMapping("/deleteAddress/{id}")
    public String deleteAddress(@PathVariable int id) {
        return "Deleting Address Of Address Id "+id+ " in Address Book";
    }

}
