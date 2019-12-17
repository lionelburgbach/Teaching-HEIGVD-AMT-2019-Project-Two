package io.avalia.user.api.endpoints;

import io.avalia.user.api.AuthenticateApi;
import io.avalia.user.api.model.UserAuth;
import io.avalia.user.entities.UsersEntity;
import io.avalia.user.jwt.JwtResponse;
import io.avalia.user.jwt.JwtToken;
import io.avalia.user.jwt.JwtUserDetailsService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")
@Controller
public class AuthenticateApiController implements AuthenticateApi {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtToken jwtToken;

    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;

    public ResponseEntity<Object> createAuthenticationToken(@ApiParam(value = "", required = true) @Valid @RequestBody UserAuth user) {

        try {
            authenticate(user.getEmail(), user.getPassword());
        }
        catch (Exception e){
            return ResponseEntity.status(401).build();
        }

        final UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(user.getEmail());
        final String token = jwtToken.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void authenticate(String username, String password) throws Exception {

        try {

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

        } catch (DisabledException e) {

            throw new Exception("USER_DISABLED", e);

        } catch (BadCredentialsException e) {

            throw new Exception("INVALID_CREDENTIALS", e);
        }
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