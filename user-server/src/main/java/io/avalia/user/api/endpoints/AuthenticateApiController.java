package io.avalia.user.api.endpoints;

import io.avalia.user.api.AuthenticateApi;
import io.avalia.user.api.model.UserAuth;
import io.avalia.user.entities.UsersEntity;
import io.avalia.user.jwt.JwtResponse;
import io.avalia.user.jwt.JwtToken;
import io.avalia.user.repositories.UsersRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")
@Controller
public class AuthenticateApiController implements AuthenticateApi {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    JwtToken jwt;

    public ResponseEntity<Object> createAuthenticationToken(@ApiParam(value = "", required = true) @Valid @RequestBody UserAuth user) {

        if (user.getEmail() == null || user.getPassword() == null) {
            return ResponseEntity.status(401).build();
        }

        String email = user.getEmail();

        Optional<UsersEntity>  userLoad = usersRepository.findById(email);
        UsersEntity ue = userLoad.get();

        if (user.getEmail() == null) {
            return ResponseEntity.noContent().build();
        }

        String pwd = ue.getPassword();
        BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
        if (!bc.matches(user.getPassword(),pwd)) {
            return ResponseEntity.noContent().build();
        }

        String token = jwt.generateToken(user);

        return ResponseEntity.ok(new JwtResponse(token));
    }

    private UsersEntity toUserAuthEntity(UserAuth userAuth) {
        UsersEntity user = new UsersEntity();
        user.setEmail(userAuth.getEmail());
        user.setPassword(userAuth.getPassword());
        return user;
    }

    private UserAuth toUserAuth(UsersEntity entity) {
        UserAuth user = new UserAuth();
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        return user;
    }
}