package io.avalia.user.api.endpoints;

import io.avalia.user.api.UsersApi;
import io.avalia.user.api.model.User;
import io.avalia.user.api.model.UserInput;
import io.avalia.user.api.model.UserOutput;
import io.avalia.user.entities.UsersEntity;
import io.avalia.user.jwt.WebSecurityConfig;
import io.avalia.user.repositories.UsersRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

    WebSecurityConfig securityConfig;

    public ResponseEntity<Object> createUser(@ApiParam(value = "", required = true) @Valid @RequestBody UserInput user) {

        UsersEntity newUserEntity = toUserEntity(user);
        if (userRepository.existsById(user.getEmail())){

            return ResponseEntity.status(401).build();
        }

        newUserEntity.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        userRepository.save(newUserEntity);
        Long id = newUserEntity.getId();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newUserEntity.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    public ResponseEntity<UserOutput> getUserByID(@ApiParam(value = "", required = true) @PathVariable("email") String email) {

        String owner = currentUserNameToken();
        if(!email.equals(owner)){
            return ResponseEntity.status(401).build();
        }

        Optional<UsersEntity> oue = userRepository.findById(email);
        UsersEntity ue = oue.get();
        return ResponseEntity.ok(toUserOutput(ue));
    }

    public ResponseEntity deleteUser(@ApiParam(value = "", required = true) @PathVariable("email") String email) {

        String owner = currentUserNameToken();
        if(!email.equals(owner)){
            return ResponseEntity.status(401).build();
        }

        userRepository.deleteById(email);
        return ResponseEntity.ok("ok");
    }

    public ResponseEntity changePassword(@ApiParam(value = "", required = true) @PathVariable("email") String email, @RequestParam("password")  String password) {

        String owner = currentUserNameToken();
        if(!email.equals(owner)){
            return ResponseEntity.status(401).build();
        }

        Optional<UsersEntity> oue = userRepository.findById(email);
        UsersEntity ue = oue.get();
        ue.setPassword(new BCryptPasswordEncoder().encode(password));
        userRepository.save(ue);
        return ResponseEntity.ok("ok");
    }

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

    private String currentUserNameToken(){

        String username;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails)principal).getUsername();
        } else {
            username = principal.toString();
        }

        return username;
    }
}