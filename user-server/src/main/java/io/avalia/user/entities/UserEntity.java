package io.avalia.user.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class UserEntity extends UserLoginEntity implements Serializable {

    private String firstname;
    private String lastname;
    private String role;
}
