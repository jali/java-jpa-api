package com.wadoha.model;

import javax.persistence.*;

/**
 * Created by Jalal Maqdisi on 30/05/2017.
 *
 */

@Entity
public class Contact {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long Id;
    @Column(name="name")
    private String Name;
    @Column(name="first_name", length=100)
    private String FirstName;
    @Column(name="last_name", length=100)
    private String LastName;
    @Column(name="position", length=100)
    private String Position;
    @Column(name="phone", length=50)
    private String Phone;
    @Column(name="email")
    private String Email;

    public Contact() {
    }

    public Contact(String name, String firstName, String lastName, String position, String phone, String email) {
        Name = name;
        FirstName = firstName;
        LastName = lastName;
        Position = position;
        Phone = phone;
        Email = email;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
