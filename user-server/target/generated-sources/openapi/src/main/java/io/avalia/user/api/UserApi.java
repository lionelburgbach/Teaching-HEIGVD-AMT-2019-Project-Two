/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.avalia.user.api;

import io.avalia.user.api.model.User;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-12T15:57:53.133+01:00[Europe/Zurich]")

@Validated
@Api(value = "user", description = "the user API")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "createUser", notes = "create a user", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "created", response = Object.class),
        @ApiResponse(code = 403, message = "You do not have necessary permissions for the resource") })
    @RequestMapping(value = "/user",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Object> createUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "deleteUser", notes = "This can only be done by the logged in user.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 403, message = "You do not have necessary permissions for the resource"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{email}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true) @PathVariable("email") String email) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getUserByID", notes = "", response = User.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 403, message = "You do not have necessary permissions for the resource"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{email}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<User> getUserByID(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathVariable("email") String email) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"password\" : \"password\", \"firstname\" : \"firstname\", \"role\" : \"role\", \"email\" : \"email\", \"lastname\" : \"lastname\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getUsers", notes = "get user paramater", response = User.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "You do not have necessary permissions for the resource") })
    @RequestMapping(value = "/user",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<User>> getUsers() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"password\" : \"password\", \"firstname\" : \"firstname\", \"role\" : \"role\", \"email\" : \"email\", \"lastname\" : \"lastname\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "updateUser", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid user supplied"),
        @ApiResponse(code = 403, message = "You do not have necessary permissions for the resource"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{email}",
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateUser(@ApiParam(value = "name that need to be updated",required=true) @PathVariable("email") String email,@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody User body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
