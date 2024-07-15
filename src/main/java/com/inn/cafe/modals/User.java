package com.inn.cafe.modals;

import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.io.Serializable;

// when email id is passed, it will return the user
@NamedQuery(name = "User.findByEmailId", query = "select u from User u where u.email=:email")

@Data
//takes care of the getter and setters for these properties ^^
//prevents boilerplate code
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name="user")

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name="contactNumber")
    private String contactNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private String status;

    @Column(name = "role")
    private String role;

}
