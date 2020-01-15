package io.avalia.user.api.endpoints;

import io.avalia.user.api.AuthenticateApi;
import io.avalia.user.api.exceptions.ApiException;
import io.avalia.user.api.model.UserAuth;
import io.avalia.user.api.model.UserToken;
import io.avalia.user.entities.UsersEntity;
import io.avalia.user.entities.JwtResponse;
import io.avalia.user.entities.JwtToken;
import io.avalia.user.repositories.UsersRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")
@Controller
public class AuthenticateApiController implements AuthenticateApi {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    HttpServletResponse resp;

    @Autowired
    JwtToken jwt;

    public ResponseEntity<Object> createAuthenticationToken(@ApiParam(value = "", required = true) @Valid @RequestBody UserAuth user) throws Exception {

        if (user.getEmail() == null || user.getPassword() == null) {
            throw new ApiException(HttpStatus.BAD_REQUEST,"Email and Password cannot be null");
        }

        String email = user.getEmail();

        Optional<UsersEntity> userLoad = usersRepository.findById(email);
        if(!userLoad.isPresent()){
            throw new ApiException(HttpStatus.UNAUTHORIZED, "Bad Credentials");
        }

        UsersEntity ue = userLoad.get();
        String pwd = ue.getPassword();
        BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
        if (!bc.matches(user.getPassword(),pwd)) {
            throw new ApiException(HttpStatus.UNAUTHORIZED, "Bad Credentials");
        }

        String token = jwt.generateToken(toUserToken(ue));

        resp.addHeader("Authorization", "Bearer "+token);

        return ResponseEntity.ok(new JwtResponse(token));
    }

    private UserToken toUserToken(UsersEntity entity) {
        UserToken user = new UserToken();
        user.setRole(entity.getRole());
        user.setEmail(entity.getEmail());
        return user;
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