package com.inn.cafe.wrapper;

import lombok.Data;
import lombok.NoArgsConstructor;

//lombok Data dependency generates getters & setters for all the defined variables and
//reduces boilerplate code
@Data
@NoArgsConstructor
public class UserWrapper {

    private Integer id;
    private String name;
    private String email;
    private String contactNumber;
    private String status;


    public UserWrapper(Integer id, String name, String contactNumber, String email, String status) {
        this.id = id;
        this.status = status;
        this.contactNumber = contactNumber;
        this.email = email;
        this.name = name;
    }
}
