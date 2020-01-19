/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.avalia.trailer.api;

import io.avalia.trailer.api.model.User;
import io.avalia.trailer.api.model.UserUpdate;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-19T19:07:07.141+01:00[Europe/Zurich]")

@Validated
@Api(value = "users", description = "the users API")
public interface UsersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "createUser", notes = "Create a user", response = Object.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "created", response = Object.class),
        @ApiResponse(code = 404, message = "This email already exist!") })
    @RequestMapping(value = "/users",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Object> createUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "deleteUserByID", notes = "Delete the user with this email", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/users/{email}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteUserByID(@ApiParam(value = "user that needs to be deleted",required=true) @PathVariable("email") String email) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getUserByID", notes = "Get the user with this email", response = User.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 401, message = "You do not have necessary permissions for the resource"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/users/{email}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<User> getUserByID(@ApiParam(value = "email of the user",required=true) @PathVariable("email") String email) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "updateUserByID", notes = "Update the user with this email", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid user supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/users/{email}",
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateUserByID(@ApiParam(value = "user that need to be updated",required=true) @PathVariable("email") String email,@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody UserUpdate userUpdate) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
