/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.avalia.user.api;

import io.avalia.user.api.model.UserInput;
import io.avalia.user.api.model.UserOutput;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-21T15:35:19.571+01:00[Europe/Zurich]")

@Validated
@Api(value = "users", description = "the users API")
public interface UsersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "changePassword", notes = "", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid user supplied"),
        @ApiResponse(code = 403, message = "You do not have necessary permissions for the resource"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/users/{email}",
        method = RequestMethod.PUT)
    default ResponseEntity<Void> changePassword(@ApiParam(value = "name that need to be updated",required=true) @PathVariable("email") String email,@NotNull @ApiParam(value = "Updated user object", required = true) @Valid @RequestParam(value = "password", required = true) String password) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "createUser", notes = "create a user", response = Object.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "created", response = Object.class),
        @ApiResponse(code = 403, message = "You do not have necessary permissions for the resource"),
        @ApiResponse(code = 502, message = "You do not have necessary permissions for the resource") })
    @RequestMapping(value = "/users",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Object> createUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserInput userInput) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "deleteUser", notes = "This can only be done by the logged in user.", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 403, message = "You do not have necessary permissions for the resource"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/users/{email}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteUser(@ApiParam(value = "name that need to be updated",required=true) @PathVariable("email") String email) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getUserByID", notes = "", response = UserOutput.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UserOutput.class),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 403, message = "You do not have necessary permissions for the resource"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/users/{email}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<UserOutput> getUserByID(@ApiParam(value = "name that need to be updated",required=true) @PathVariable("email") String email) {
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


    @ApiOperation(value = "", nickname = "getUsers", notes = "get user paramater", response = UserOutput.class, responseContainer = "List", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = UserOutput.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "You do not have necessary permissions for the resource") })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<UserOutput>> getUsers() {
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

}
