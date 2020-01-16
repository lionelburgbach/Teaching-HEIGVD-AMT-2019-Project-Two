package io.avalia.user.api.endpoints;

import io.avalia.user.api.AuthenticateApi;
import io.avalia.user.api.business.AuthService;
import io.avalia.user.api.model.UserAuth;
import io.avalia.user.entities.JwtResponse;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")
@Controller
public class AuthenticateApiController implements AuthenticateApi {

    @Autowired
    HttpServletResponse resp;

    @Autowired
    AuthService authService;

    public ResponseEntity<Object> createAuthenticationToken(@ApiParam(value = "", required = true) @Valid @RequestBody UserAuth user) throws Exception {

        String token = authService.createAuthenticationToken(user);
        resp.addHeader("Authorization", "Bearer " + token);
        return ResponseEntity.ok(new JwtResponse(token));
    }
}