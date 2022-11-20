package com.blog.blog.models.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.blog.blog.models._abstract.AbstractEntity;
import com.blog.blog.models._abstract.enums.CivilityEnum;

@Entity
@Table(name = "users")
public class UserEntity extends AbstractEntity   {

    @Enumerated(EnumType.ORDINAL)
    private CivilityEnum civility;
    
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique=true, nullable = false)
    private String username;

    @Column(unique=true, nullable = false)
    private String email;

    @Column(nullable = true)
    private String phoneNumber;

    @Column(nullable = true)
    private String password;

    @Column(nullable = true)
    private String passwordToken;

    public UserEntity() {
    }

    public UserEntity(boolean activated, CivilityEnum civility,String firstName, String lastName, String username, String email, String phoneNumber, String password) {
        super(activated);
        this.civility = civility;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public CivilityEnum getCivility() {
        return civility;
    }

    public void setCivility(CivilityEnum civility) {
        this.civility = civility;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}