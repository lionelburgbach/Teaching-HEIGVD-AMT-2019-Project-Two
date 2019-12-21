package io.avalia.trailer.api.endpoints;

import io.avalia.trailer.api.UsersApi;
import io.avalia.trailer.api.model.User;
import io.avalia.trailer.entities.UsersEntity;
import io.avalia.trailer.jwt.JwtToken;
import io.avalia.trailer.repositories.UsersRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")

@Controller
public class UsersApiController implements UsersApi{

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    JwtToken jwt;

    @Autowired
    HttpServletRequest request;

    public ResponseEntity<Object> createUser(@ApiParam(value = "", required = true) @Valid @RequestBody User user) {

        String email = jwt.getUsernameFromToken(getToken());
        if(!usersRepository.existsById(email)){
            return ResponseEntity.status(401).build();
        }

        UsersEntity newUsersEntity = toUserEntity(user);
        usersRepository.save(newUsersEntity);
        Long id = newUsersEntity.getId();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newUsersEntity.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    public ResponseEntity<User> getUserByID(String email) {

        if(!jwt.validateToken(getToken(), email)){
            return ResponseEntity.status(401).build();
        }

        Optional<UsersEntity> oue = usersRepository.findById(email);
        UsersEntity ue = oue.get();
        return ResponseEntity.ok(toUser(ue));
    }

    public ResponseEntity deleteUser(String email) {

        if(!jwt.validateToken(getToken(), email)){
            return ResponseEntity.status(401).build();
        }

        usersRepository.deleteById(email);
        return ResponseEntity.ok("ok");
    }

    /*
    public ResponseEntity<User>  updateUser(String email) {

        Optional<UserEntity> oue = userRepository.save(email);
        UserEntity ue = oue.get();
        return ResponseEntity.ok(toUser(ue));
    }
     */

    public ResponseEntity<List<User>> getUsers() {

        String email = jwt.getUsernameFromToken(getToken());
        if(!usersRepository.existsById(email)){
            return ResponseEntity.status(401).build();
        }

        List<User> users = new ArrayList<>();
        for (UsersEntity usersEntity : usersRepository.findAll()) {
            users.add(toUser(usersEntity));
        }
        return ResponseEntity.ok(users);
    }

    private UsersEntity toUserEntity(User user) {
        UsersEntity entity = new UsersEntity();
        entity.setFirstname(user.getFirstname());
        entity.setLastname(user.getLastname());
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        entity.setDate(user.getDate());
        return entity;
    }

    private User toUser(UsersEntity entity) {
        User user = new User();
        user.setFirstname(entity.getFirstname());
        user.setLastname(entity.getLastname());
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        user.setDate(entity.getDate());
        return user;
    }

    private String getToken(){

        String bearer = request.getHeader("Authorization");
        if(bearer.length() < 7) {
            throw new IllegalArgumentException("No Token");
        }
        String token = bearer.substring(7);
        return token;
    }
}