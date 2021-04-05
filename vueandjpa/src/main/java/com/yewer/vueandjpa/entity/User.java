package com.yewer.vueandjpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    private Integer id;

    private String userName;
    private  String passWord;
    private  String userSex;

}
