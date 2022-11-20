package com.blog.blog.models.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.blog.blog.models._abstract.AbstractEntity;
import com.blog.blog.models._abstract.enums.CivilityEnum;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter 
@NoArgsConstructor
@Table(name = "users")
public class UserEntity extends AbstractEntity   {

    @Enumerated(EnumType.ORDINAL)
    private CivilityEnum civility;
    
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique=true, nullable = true)
    private String username;

    @Column(unique=true, nullable = false)
    private String email;

    @Column(nullable = true)
    private String phoneNumber;

    @Column(nullable = true)
    private String password;

    @Column(nullable = true)
    private String passwordToken;

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

}