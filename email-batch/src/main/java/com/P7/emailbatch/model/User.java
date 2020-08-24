package com.P7.emailbatch.model;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;


@Getter
@Setter
@Entity

public class User {

    private String email;
}
