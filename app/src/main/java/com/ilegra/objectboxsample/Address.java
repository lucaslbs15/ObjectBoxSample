package com.ilegra.objectboxsample;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.annotation.Generated;

/**
 * Created by IT Staff on 03/03/2017.
 */
@Entity
public class Address {
    @Id
    private Long id;
    private String name;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    @Generated(hash = 2141422657)
    public Address(Long id, String name, String city, String state, String country,
            String zipCode) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    @Generated(hash = 388317431)
    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
