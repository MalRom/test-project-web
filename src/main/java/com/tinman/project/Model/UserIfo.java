package com.tinman.project.Model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.xml.crypto.Data;

@Entity
@Table (name = "UsersInfo")
public class UserIfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int phone;
    private String address;
    @Email
    private String email;


    public UserIfo() {
    }

    public UserIfo(Long id, int phone, String address, @Email String email) {
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
