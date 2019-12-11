package io.avalia.user.api.endpoints;

import io.avalia.user.api.AuthenticateApi;
import io.avalia.user.api.jwt.JwtTokenProvider;
import io.avalia.user.api.model.UserLogin;
import io.avalia.user.entities.UserEntity;
import io.avalia.user.entities.UserLoginEntity;
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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")
@Controller
public class AuthenticateApiController implements AuthenticateApi {

    @Autowired
    UserRepository userRepository;

    @Autowired
    JwtTokenProvider jtp;

    public ResponseEntity<Object> createAuthenticationToken(@ApiParam(value = "", required = true) @Valid @RequestBody UserLogin user) {
        UserLoginEntity newUserEntity = toUserLoginEntity(user);
        String tok = jtp.createToken(newUserEntity.getEmail(), new ArrayList<>());
        return ResponseEntity.ok(tok);
    }


    private UserEntity toUserLoginEntity(UserLogin user) {
        UserEntity entity = new UserEntity();
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        return entity;
    }

    private UserLogin toUser(UserLoginEntity entity) {
        UserLogin user = new UserLogin();
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        return user;
    }
}
