package com.minicursodocker.dockerdemo.entity;

public class Address {

    private Long addressId;
    private String street;

    public Address(){}

    public Address(Long addressId, String street){
        this.addressId = addressId;
        this.street = street;
    }
 
    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
