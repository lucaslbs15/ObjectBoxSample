package com.ilegra.objectboxsample;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.annotation.Generated;

/**
 * Created by Home on 07/03/2017.
 */
@Entity
public class Address {
    @Id
    private Long addressId;
    private String name;
    private String zipCode;
    private String city;
    private String country;
    private Long userId;

    @Generated(hash = 1531178230)
    public Address(Long addressId, String name, String zipCode, String city,
            String country, Long userId) {
        this.addressId = addressId;
        this.name = name;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.userId = userId;
    }

    @Generated(hash = 388317431)
    public Address() {
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
