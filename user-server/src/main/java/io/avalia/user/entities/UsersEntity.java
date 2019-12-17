package io.avalia.user.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class UsersEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Id
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String role;
}
