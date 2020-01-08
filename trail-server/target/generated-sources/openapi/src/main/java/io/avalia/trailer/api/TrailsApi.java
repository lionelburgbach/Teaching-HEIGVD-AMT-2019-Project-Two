/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.avalia.trailer.api;

import io.avalia.trailer.api.model.Trail;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-08T23:22:03.510983+01:00[Europe/Zurich]")

@Validated
@Api(value = "trails", description = "the trails API")
public interface TrailsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "allTrails", notes = "all trails", response = Trail.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "read", response = Trail.class, responseContainer = "List") })
    @RequestMapping(value = "/trails",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Trail>> allTrails() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"date\", \"name\" : \"name\", \"length\" : 0, \"upAndDown\" : 6, \"desprition\" : \"desprition\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "createTrail", notes = "create a trail", response = Object.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "created", response = Object.class) })
    @RequestMapping(value = "/trails",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Object> createTrail(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Trail trail) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "deleteTrail", notes = "", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid Trail id supplied"),
        @ApiResponse(code = 404, message = "Trail not found") })
    @RequestMapping(value = "/trails/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteTrail(@ApiParam(value = "The name that needs to be deleted",required=true) @PathVariable("id") Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getTrailByID", notes = "", response = Trail.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trail.class),
        @ApiResponse(code = 400, message = "Invalid Trail supplied"),
        @ApiResponse(code = 404, message = "Trail not found") })
    @RequestMapping(value = "/trails/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Trail> getTrailByID(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathVariable("id") Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"date\", \"name\" : \"name\", \"length\" : 0, \"upAndDown\" : 6, \"desprition\" : \"desprition\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "updateTrail", notes = "", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid trail supplied"),
        @ApiResponse(code = 404, message = "Trail not found") })
    @RequestMapping(value = "/trails/{id}",
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateTrail(@ApiParam(value = "name that need to be updated",required=true) @PathVariable("id") Long id,@ApiParam(value = "Updated Trail object" ,required=true )  @Valid @RequestBody Trail body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
