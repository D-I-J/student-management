package io.student.studentmanagement.dto;

public class AddressDto {
    private Integer addressId;
    private String houseNo;
    private String street;
    private String city;
    private String country;
    private StudentDto student;

    public AddressDto() {

    }

    public StudentDto getStudent() {
        return student;
    }

    public void setStudent(StudentDto student) {
        this.student = student;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AddressDto(Integer addressId, String houseNo, String street, String city, String country, StudentDto student) {
        this.addressId = addressId;
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.country = country;
        this.student = student;
    }

}