package io.avalia.user.api.endpoints;

import io.avalia.user.api.UsersApi;
import io.avalia.user.api.business.UsersService;
import io.avalia.user.api.exceptions.ApiException;
import io.avalia.user.api.model.UserInput;
import io.avalia.user.api.model.UserToken;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")
@Controller
public class UsersApiController implements UsersApi{

    @Autowired
    UsersService usersService;

    public ResponseEntity<Object> createUser(@ApiParam(value = "", required = true) @Valid @RequestBody UserInput user) throws Exception {

        return usersService.createUser(user);
    }

    public ResponseEntity<UserToken> getUserByID(@ApiParam(value = "", required = true) @PathVariable("email") String email) throws Exception {

        ResponseEntity<UserToken> responseEntity;
        try{
            responseEntity = usersService.getUserByID(email);
        }
        catch(Exception e){
            throw new ApiException(HttpStatus.NOT_FOUND, "User not Found");
        }
       return responseEntity;
    }

    public ResponseEntity deleteUserByID(@ApiParam(value = "", required = true) @PathVariable("email") String email) throws Exception {

        ResponseEntity responseEntity;
        try{
            responseEntity = usersService.deleteUserByID(email);
        }
        catch(Exception e){
            throw new ApiException(HttpStatus.BAD_REQUEST, "Fail to delete this user");
        }
        return responseEntity;
    }

    public ResponseEntity updatePasswordByID(@ApiParam(value = "", required = true) @PathVariable("email") String email, @RequestParam("password")  String password) throws Exception {

        ResponseEntity responseEntity;
        try{
            responseEntity = usersService.updatePasswordByID(email, password);
        }
        catch(Exception e){
            throw new ApiException(HttpStatus.BAD_REQUEST, "Fail to change password of this user");
        }
        return responseEntity;
    }

    public ResponseEntity<List<UserToken>> getUsers(@ApiParam(value = "", defaultValue = "0") @Valid @RequestParam(value = "PageNumber", required = false, defaultValue="0") Integer pageNumber,@ApiParam(value = "", defaultValue = "30") @Valid @RequestParam(value = "numberOfUsers", required = false, defaultValue="30") Integer numberOfUsers) throws Exception{

        ResponseEntity<List<UserToken>> responseEntity;
        try{
            responseEntity = usersService.getUsers(pageNumber, numberOfUsers);
        }
        catch(Exception e){
            throw new ApiException(HttpStatus.BAD_REQUEST, "Fail to update this user");
        }
        return responseEntity;
    }
}