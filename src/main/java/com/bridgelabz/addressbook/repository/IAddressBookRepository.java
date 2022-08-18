package com.bridgelabz.addressbook.repository;

import com.bridgelabz.addressbook.model.AddressBookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressBookRepository extends JpaRepository<AddressBookModel ,Integer> {
}
