package io.avalia.user.api.endpoints;

import io.avalia.user.api.UserApi;
import io.avalia.user.api.model.User;
import io.avalia.user.api.model.UserInput;
import io.avalia.user.api.model.UserOutput;
import io.avalia.user.api.model.UserUpdate;
import io.avalia.user.entities.UserEntity;
import io.avalia.user.repositories.UserRepository;
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
public class UserApiController implements UserApi{

    @Autowired
    UserRepository userRepository;

    public ResponseEntity<Object> createUser(@ApiParam(value = "", required = true) @Valid @RequestBody UserInput user) {
        UserEntity newUserEntity = toUserEntity(user);
        userRepository.save(newUserEntity);
        Long id = newUserEntity.getId();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newUserEntity.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    public ResponseEntity<UserOutput> getUserByID(String email) {

        Optional<UserEntity> oue = userRepository.findById(email);
        UserEntity ue = oue.get();
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
        for (UserEntity userEntity : userRepository.findAll()) {
            users.add(toUserOutput(userEntity));
        }
        return ResponseEntity.ok(users);
    }

    private UserEntity toUserOutptEntity(UserOutput user) {
        UserEntity entity = new UserEntity();
        entity.setFirstname(user.getFirstname());
        entity.setLastname(user.getLastname());
        entity.setEmail(user.getEmail());
        return entity;
    }

    private UserOutput toUserOutput(UserEntity entity) {
        UserOutput user = new UserOutput();
        user.setFirstname(entity.getFirstname());
        user.setLastname(entity.getLastname());
        user.setEmail(entity.getEmail());
        return user;
    }

    private UserEntity toUserEntity(UserInput user) {
        UserEntity entity = new UserEntity();
        entity.setFirstname(user.getFirstname());
        entity.setLastname(user.getLastname());
        entity.setPassword(user.getPassword());
        entity.setRole(user.getRole());
        entity.setEmail(user.getEmail());
        return entity;
    }

    private UserInput toUserInput(UserEntity entity) {
        UserInput user = new UserInput();
        user.setFirstname(entity.getFirstname());
        user.setLastname(entity.getLastname());
        user.setRole(entity.getRole());
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        return user;
    }

    private UserEntity toUserEntity(User user) {
        UserEntity entity = new UserEntity();
        entity.setPassword(entity.getPassword());
        entity.setEmail(user.getEmail());
        return entity;
    }

    private UserInput toUser(UserEntity entity) {
        UserInput user = new UserInput();
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        return user;
    }
}