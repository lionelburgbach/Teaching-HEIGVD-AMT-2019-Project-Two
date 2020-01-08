/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.avalia.trailer.api;

import io.avalia.trailer.api.model.Registration;
import io.avalia.trailer.api.model.RegistrationOutput;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-08T21:03:18.208+01:00[Europe/Zurich]")

@Validated
@Api(value = "registrations", description = "the registrations API")
public interface RegistrationsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "createRegistration", notes = "create a registration", response = Object.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "created", response = Object.class) })
    @RequestMapping(value = "/registrations",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Object> createRegistration(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Registration user) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "deleteRegistrationByID", notes = "", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid id supplied"),
        @ApiResponse(code = 404, message = "Registration not found") })
    @RequestMapping(value = "/registrations/{email}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteRegistrationByID(@ApiParam(value = "The registration id that needs to be deleted",required=true) @PathVariable("email") String email,@NotNull @ApiParam(value = "The registration id that needs to be deleted", required = true) @Valid @RequestParam(value = "id", required = true) Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getRegistrationByIdUser", notes = "", response = RegistrationOutput.class, responseContainer = "List", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "read", response = RegistrationOutput.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid id supplied"),
        @ApiResponse(code = 404, message = "Registration not found") })
    @RequestMapping(value = "/registrations/{email}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<RegistrationOutput>> getRegistrationByIdUser(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathVariable("email") String email) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"trailName\" : \"trailName\", \"email\" : \"email\", \"idReg\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
