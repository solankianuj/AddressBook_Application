package com.bridgelabz.addressbook.services;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.exception.AddressNotFound;
import com.bridgelabz.addressbook.model.AddressBookModel;
import com.bridgelabz.addressbook.repository.IAddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class AddressBookServices implements  IAddressBookServices{
    @Autowired
    IAddressBookRepository addressBookRepository;

    @Override
    public  List<AddressBookModel> seeAddressBook() {
        List<AddressBookModel> address=addressBookRepository.findAll();

        return address;
    }

    @Override
    public AddressBookModel addingAddress(AddressBookDTO addressBookDTO) {
        AddressBookModel addressBookModel=new AddressBookModel(addressBookDTO);
        addressBookRepository.save(addressBookModel);
        return addressBookModel;
    }

    @Override
    public AddressBookModel updateAddress(int id, AddressBookDTO addressBookDTO) {
        AddressBookModel addressBookModel=this.getAddress(id);

        addressBookModel.setFullName(addressBookDTO.getFullName());
        addressBookModel.setAddress(addressBookDTO.getAddress());
        addressBookModel.setCity(addressBookDTO.getCity());
        addressBookModel.setState(addressBookDTO.getState());
        addressBookModel.setZipcode(addressBookDTO.getZipcode());
        addressBookModel.setPhoneNumber(addressBookDTO.getPhoneNumber());
        addressBookRepository.save(addressBookModel);
           return addressBookModel;
    }

    @Override
    public AddressBookModel getAddress(int id) {
        Optional<AddressBookModel> address=addressBookRepository.findById(id);
        if (address.isPresent()){
            return address.get();
        }
        throw new AddressNotFound(400,"Address Not Found !");
    }

    @Override
    public void deleteAddress(int id) {
        AddressBookModel addressBookModel=this.getAddress(id);
        addressBookRepository.delete(addressBookModel);

    }
}
