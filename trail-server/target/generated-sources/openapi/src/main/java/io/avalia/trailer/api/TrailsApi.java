/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.avalia.trailer.api;

import io.avalia.trailer.api.model.Trail;
import io.avalia.trailer.api.model.TrailOutput;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-19T15:53:07.938+01:00[Europe/Zurich]")

@Validated
@Api(value = "trails", description = "the trails API")
public interface TrailsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "createTrail", notes = "Create a trail", response = Object.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "created", response = Object.class) })
    @RequestMapping(value = "/trails",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Object> createTrail(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Trail trail) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "deleteTrailByID", notes = "Delete the trail with this id", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid Trail id supplied"),
        @ApiResponse(code = 404, message = "Trail not found") })
    @RequestMapping(value = "/trails/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteTrailByID(@ApiParam(value = "trail that needs to be deleted",required=true) @PathVariable("id") Long id) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getTrailByID", notes = "Get the trail by this id", response = TrailOutput.class, authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TrailOutput.class),
        @ApiResponse(code = 400, message = "Invalid Trail supplied"),
        @ApiResponse(code = 404, message = "Trail not found") })
    @RequestMapping(value = "/trails/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<TrailOutput> getTrailByID(@ApiParam(value = "The id of the trail",required=true) @PathVariable("id") Long id) throws Exception {
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


    @ApiOperation(value = "", nickname = "getTrails", notes = "Get all trails", response = TrailOutput.class, responseContainer = "List", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Array with all trails", response = TrailOutput.class, responseContainer = "List") })
    @RequestMapping(value = "/trails",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<TrailOutput>> getTrails(@ApiParam(value = "", defaultValue = "0") @Valid @RequestParam(value = "PageNumber", required = false, defaultValue="0") Integer pageNumber,@ApiParam(value = "", defaultValue = "30") @Valid @RequestParam(value = "numberOfTrailsPerPage", required = false, defaultValue="30") Integer numberOfTrailsPerPage) throws Exception {
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


    @ApiOperation(value = "", nickname = "updateTrailByID", notes = "Update the trail with this id", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid trail supplied"),
        @ApiResponse(code = 404, message = "Trail not found") })
    @RequestMapping(value = "/trails/{id}",
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateTrailByID(@ApiParam(value = "id for the trail that need to be updated",required=true) @PathVariable("id") Long id,@ApiParam(value = "Updated Trail object" ,required=true )  @Valid @RequestBody Trail trail) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
