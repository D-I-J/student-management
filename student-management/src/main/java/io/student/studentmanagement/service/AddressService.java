package io.student.studentmanagement.service;

import io.student.studentmanagement.entity.Address;
import io.student.studentmanagement.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> allAddress(){
        return addressRepository.findAll();
    }

    public Address addAddress(Address address){
        address.setAddressId(0);
        return addressRepository.save(address);
    }

    public Address getAddress(int id){
        return addressRepository.findById(id).get();
    }

    public void deleteAddress(int id){
        addressRepository.deleteById(id);
    }

//    make delete by setting isDelete column to true
//    DO NOT DELETE THE RECORD
}
