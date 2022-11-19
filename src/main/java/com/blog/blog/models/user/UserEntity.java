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

    @Column(nullable = false    )
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

    public UserEntity(int id, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

}