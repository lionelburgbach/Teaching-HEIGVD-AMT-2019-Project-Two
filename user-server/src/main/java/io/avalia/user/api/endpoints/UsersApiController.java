package io.avalia.user.api.endpoints;

import io.avalia.user.api.UsersApi;
import io.avalia.user.api.exceptions.ApiException;
import io.avalia.user.api.model.UserInput;
import io.avalia.user.api.model.UserToken;
import io.avalia.user.entities.UsersEntity;
import io.avalia.user.jwt.JwtToken;
import io.avalia.user.repositories.UsersRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

    public ResponseEntity<Object> createUser(@ApiParam(value = "", required = true) @Valid @RequestBody UserInput user) throws Exception {

        if(!jwt.getRoleFromToken(getToken()).equals("admin")){
            throw new ApiException(401,"You don't have rights to add a new user!");
        }

        UsersEntity newUserEntity = toUserEntity(user);
        if (usersRepository.existsById(user.getEmail())){
            throw new ApiException(409, "This email already exist!");
        }

        newUserEntity.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        usersRepository.save(newUserEntity);
        Long id = newUserEntity.getId();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newUserEntity.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    public ResponseEntity<UserToken> getUserByID(@ApiParam(value = "", required = true) @PathVariable("email") String email) throws Exception {

        if(!jwt.validateToken(getToken(), email)){
            throw new ApiException(403 ,"You don't have rights to read properties from this email: " + email);
        }

        Optional<UsersEntity> oue = usersRepository.findById(email);
        UsersEntity ue = oue.get();
        return ResponseEntity.ok(toUserToken(ue));
    }

    public ResponseEntity deleteUserByID(@ApiParam(value = "", required = true) @PathVariable("email") String email) throws Exception {

        if(!(jwt.getRoleFromToken(getToken()).equals("admin") || jwt.validateToken(getToken(), email))){
            throw new ApiException(403, "You don't have rights to delete this user!");
        }

        usersRepository.deleteById(email);
        return ResponseEntity.ok("ok");
    }

    public ResponseEntity updatePasswordByID(@ApiParam(value = "", required = true) @PathVariable("email") String email, @RequestParam("password")  String password) throws Exception {

        if(!jwt.validateToken(getToken(), email)){
            throw new ApiException(403,"You don't have rights to read properties from this email: " + email);
        }

        Optional<UsersEntity> oue = usersRepository.findById(email);
        UsersEntity ue = oue.get();
        ue.setPassword(new BCryptPasswordEncoder().encode(password));
        usersRepository.save(ue);
        return ResponseEntity.ok("ok");
    }

    public ResponseEntity<List<UserToken>> getUsers() throws Exception {

        if(!jwt.getRoleFromToken(getToken()).equals("admin")){
            throw new ApiException(403, "You don't have rights to add a new user!");
        }

        List<UserToken> users = new ArrayList<>();
        for (UsersEntity userEntity : usersRepository.findAll()) {
            users.add(toUserToken(userEntity));
        }
        return ResponseEntity.ok(users);
    }

    private UsersEntity toUserEntity(UserToken user) {
        UsersEntity entity = new UsersEntity();
        entity.setEmail(user.getEmail());
        entity.setRole(user.getRole());
        return entity;
    }

    private UserToken toUserToken(UsersEntity entity) {
        UserToken user = new UserToken();
        user.setEmail(entity.getEmail());
        user.setRole(entity.getRole());
        return user;
    }

    private UsersEntity toUserEntity(UserInput user) {
        UsersEntity entity = new UsersEntity();
        entity.setPassword(user.getPassword());
        entity.setRole(user.getRole());
        entity.setEmail(user.getEmail());
        return entity;
    }

    private UserInput toUserInput(UsersEntity entity) {
        UserInput user = new UserInput();
        user.setRole(entity.getRole());
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        return user;
    }

    private String getToken() throws Exception{
        return request.getHeader("Authorization").split(" ")[1];
    }
}