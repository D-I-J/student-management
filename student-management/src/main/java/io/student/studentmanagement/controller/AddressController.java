package io.student.studentmanagement.controller;

import io.student.studentmanagement.dto.AddressDto;
import io.student.studentmanagement.entity.Address;
import io.student.studentmanagement.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping
    public List<AddressDto> allAddress(){
        return addressService.allAddress();
    }
    @GetMapping("/{id}")
    public AddressDto getAddress(@PathVariable int id){
        return addressService.getAddress(id);
    }

    @PostMapping
    public AddressDto addAddress(@RequestBody AddressDto addressDto){
        return addressService.addAddress(addressDto);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable int id){
        addressService.deleteAddress(id);
    }
}
