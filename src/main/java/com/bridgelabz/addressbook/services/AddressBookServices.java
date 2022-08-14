package com.bridgelabz.addressbook.services;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AddressBookServices implements  IAddressBookServices{

    List<AddressBookModel> addressBookModelList=new ArrayList<>();

    @Override
    public List<AddressBookModel> seeAddressBook() {

        return addressBookModelList;
    }

    @Override
    public AddressBookModel addingAddress(AddressBookDTO addressBookDTO) {
        AddressBookModel addressBookModel=new AddressBookModel(addressBookModelList.size()+1,addressBookDTO);
        addressBookModelList.add(addressBookModel);
        return addressBookModel;
    }

    @Override
    public AddressBookModel updateAddress(int id, AddressBookDTO addressBookDTO) {
       AddressBookModel addressBookModel= this.getAddress(id);
       addressBookModel.setFullName(addressBookDTO.getFullName());
       addressBookModel.setAddress(addressBookDTO.getAddress());
        addressBookModel.setCity(addressBookDTO.getCity());
        addressBookModel.setState(addressBookDTO.getState());
        addressBookModel.setZipcode(addressBookDTO.getZipcode());
        addressBookModel.setPhoneNumber(addressBookDTO.getPhoneNumber());
        
        return addressBookModel;
    }

    @Override
    public AddressBookModel getAddress(int id) {
        List<AddressBookModel>  addressBookModelList1 = addressBookModelList.stream().filter(x-> x.getAddressId()==id).collect(Collectors.toList());

        return addressBookModelList1.get(0);
    }


    @Override
    public List<AddressBookModel> deleteAddress(long phoneNumber) {
         addressBookModelList= addressBookModelList.stream().filter(x-> x.getPhoneNumber()!=phoneNumber).collect(Collectors.toList());
        return addressBookModelList;
    }
}
