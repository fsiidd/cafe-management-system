package com.inn.cafe.modals;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@NamedQuery(name = "Category.getAllCategory",query = "select c from Category c")

@Data
//takes care of the getter and setters for these properties ^^
//prevents boilerplate code
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name="category")
public class Category implements Serializable {

    @Serial
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
}