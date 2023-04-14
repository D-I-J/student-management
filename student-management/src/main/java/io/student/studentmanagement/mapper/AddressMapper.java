package io.student.studentmanagement.mapper;
import io.student.studentmanagement.dto.AddressDto;
import io.student.studentmanagement.entity.Address;

public class AddressMapper {
    public static Address dtoToEntity(AddressDto addressDto) {
        Address address = new Address();
        address.setAddressId(addressDto.getAddressId());
        address.setHouseNo(addressDto.getHouseNo());
        address.setStreet(addressDto.getStreet());
        address.setCity(addressDto.getCity());
        address.setCountry(addressDto.getCountry());
        return address;
    }

    public AddressDto mapTODto(Address address){
        AddressDto addressDto = new AddressDto();
        addressDto.setAddressId(address.getAddressId());
        addressDto.setHouseNo(address.getHouseNo());
        addressDto.setStreet(address.getStreet());
        addressDto.setCity(address.getCity());
        addressDto.setCountry(address.getCountry());
        return addressDto;
    }

}
