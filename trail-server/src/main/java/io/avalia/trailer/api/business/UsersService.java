package io.avalia.trailer.api.business;

import io.avalia.trailer.api.exceptions.ApiException;
import io.avalia.trailer.api.model.User;
import io.avalia.trailer.api.model.UserUpdate;
import io.avalia.trailer.entities.UsersEntity;
import io.avalia.trailer.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Component
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    public ResponseEntity<Object> createUser(User user) throws Exception{

        UsersEntity newUserEntity = toUserEntity(user);
        if (usersRepository.existsById(user.getEmail())){
            throw new ApiException(HttpStatus.BAD_REQUEST, "This email already exist!");
        }

        usersRepository.save(newUserEntity);
        Long id = newUserEntity.getId();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newUserEntity.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    public ResponseEntity<User> getUserByID(String email){

        Optional<UsersEntity> oue = usersRepository.findById(email);
        UsersEntity ue = oue.get();
        return ResponseEntity.ok(toUser(ue));
    }

    public ResponseEntity deleteUserByID(String email){

        usersRepository.deleteById(email);
        return ResponseEntity.ok("It has been delete!");
    }


    public ResponseEntity updateUserByID(String email, UserUpdate user) {

        Optional<UsersEntity> oue = usersRepository.findById(email);
        UsersEntity ue = oue.get();
        ue.setDate(user.getDate());
        ue.setFirstname(user.getFirstname());
        ue.setLastname(user.getLastname());
        usersRepository.save(ue);
        return ResponseEntity.ok("It has been update!");
    }

    private UsersEntity toUserEntity(User user) {
        UsersEntity entity = new UsersEntity();
        entity.setFirstname(user.getFirstname());
        entity.setLastname(user.getLastname());
        entity.setEmail(user.getEmail());
        entity.setDate(user.getDate());
        return entity;
    }

    private User toUser(UsersEntity entity) {
        User user = new User();
        user.setFirstname(entity.getFirstname());
        user.setLastname(entity.getLastname());
        user.setEmail(entity.getEmail());
        user.setDate(entity.getDate());
        return user;
    }
}
