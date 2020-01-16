package io.avalia.trailer.api.endpoints;

import io.avalia.trailer.api.UsersApi;
import io.avalia.trailer.api.business.UsersService;
import io.avalia.trailer.api.exceptions.ApiException;
import io.avalia.trailer.api.model.User;
import io.avalia.trailer.api.model.UserUpdate;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")
@Controller
public class UsersApiController implements UsersApi{

    @Autowired
    UsersService usersService;

    public ResponseEntity<Object> createUser(@ApiParam(value = "", required = true) @Valid @RequestBody User user) throws Exception {

        return usersService.createUser(user);
    }

    public ResponseEntity<User> getUserByID(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathVariable("email") String email) throws Exception {

        ResponseEntity<User> responseEntity;
        try{
            responseEntity = usersService.getUserByID(email);
        }
        catch(Exception e){
            throw new ApiException(HttpStatus.NOT_FOUND, "User not Found");
        }
        return responseEntity;
    }

    public ResponseEntity deleteUserByID(@ApiParam(value = "The name that needs to be deleted",required=true) @PathVariable("email") String email) throws Exception {

        ResponseEntity responseEntity;
        try{
            responseEntity = usersService.deleteUserByID(email);
        }
        catch(Exception e){
            throw new ApiException(HttpStatus.BAD_REQUEST, "Fail to delete this user");
        }
        return responseEntity;
    }

    public ResponseEntity<User>  updateUser(@ApiParam(value = "name that need to be updated",required=true) @PathVariable("email") String email,@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody UserUpdate userUpdate) throws Exception {

        ResponseEntity responseEntity;
        try{
            responseEntity = usersService.updateUserByID(email,userUpdate);
        }
        catch(Exception e){
            throw new ApiException(HttpStatus.BAD_REQUEST, "Fail to update this user");
        }
        return responseEntity;
    }
}