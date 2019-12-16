package io.avalia.user.api.endpoints;

import io.avalia.user.api.UsersApi;
import io.avalia.user.api.model.User;
import io.avalia.user.api.model.UserInput;
import io.avalia.user.api.model.UserOutput;
import io.avalia.user.entities.UsersEntity;
import io.avalia.user.repositories.UsersRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")
@Controller
public class UsersApiController implements UsersApi{

    @Autowired
    UsersRepository userRepository;

    public ResponseEntity<Object> createUser(@ApiParam(value = "", required = true) @Valid @RequestBody UserInput user) {
        UsersEntity newUserEntity = toUserEntity(user);
        userRepository.save(newUserEntity);
        Long id = newUserEntity.getId();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newUserEntity.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    public ResponseEntity<UserOutput> getUserByID(String email) {

        Optional<UsersEntity> oue = userRepository.findById(email);
        UsersEntity ue = oue.get();
        return ResponseEntity.ok(toUserOutput(ue));
    }

    public ResponseEntity deleteUser(String email) {
        userRepository.deleteById(email);
        return ResponseEntity.ok("ok");
    }

    /*
    public ResponseEntity<Object>  updateUser(UserUpdate userUpdate) {

        Optional<UserEntity> oue = userRepository.save(userUpdate);
        UserEntity ue = oue.get();
        return ResponseEntity.ok(toUser(ue));
    }
    */

    public ResponseEntity<List<UserOutput>> getUsers() {
        List<UserOutput> users = new ArrayList<>();
        for (UsersEntity userEntity : userRepository.findAll()) {
            users.add(toUserOutput(userEntity));
        }
        return ResponseEntity.ok(users);
    }

    private UsersEntity toUserOutptEntity(UserOutput user) {
        UsersEntity entity = new UsersEntity();
        entity.setFirstname(user.getFirstname());
        entity.setLastname(user.getLastname());
        entity.setEmail(user.getEmail());
        return entity;
    }

    private UserOutput toUserOutput(UsersEntity entity) {
        UserOutput user = new UserOutput();
        user.setFirstname(entity.getFirstname());
        user.setLastname(entity.getLastname());
        user.setEmail(entity.getEmail());
        return user;
    }

    private UsersEntity toUserEntity(UserInput user) {
        UsersEntity entity = new UsersEntity();
        entity.setFirstname(user.getFirstname());
        entity.setLastname(user.getLastname());
        entity.setPassword(user.getPassword());
        entity.setRole(user.getRole());
        entity.setEmail(user.getEmail());
        return entity;
    }

    private UserInput toUserInput(UsersEntity entity) {
        UserInput user = new UserInput();
        user.setFirstname(entity.getFirstname());
        user.setLastname(entity.getLastname());
        user.setRole(entity.getRole());
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        return user;
    }

    private UsersEntity toUserEntity(User user) {
        UsersEntity entity = new UsersEntity();
        entity.setPassword(entity.getPassword());
        entity.setEmail(user.getEmail());
        return entity;
    }

    private UserInput toUser(UsersEntity entity) {
        UserInput user = new UserInput();
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        return user;
    }
}