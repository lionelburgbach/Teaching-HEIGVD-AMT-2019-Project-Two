package io.avalia.trailer.api.endpoints;

import io.avalia.trailer.api.TrailsApi;
import io.avalia.trailer.api.business.TrailsService;
import io.avalia.trailer.api.exceptions.ApiException;
import io.avalia.trailer.api.model.Trail;
import io.avalia.trailer.api.model.TrailOutput;
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
public class TrailsApiController implements TrailsApi {

    @Autowired
    TrailsService trailsService;

    public ResponseEntity<Object> createTrail(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Trail trail) {

        return trailsService.createTrail(trail);
    }

    public ResponseEntity<List<TrailOutput>> getTrails(@ApiParam(value = "", defaultValue = "0") @Valid @RequestParam(value = "PageNumber", required = false, defaultValue="0") Integer pageNumber,@ApiParam(value = "", defaultValue = "30") @Valid @RequestParam(value = "numberOfTrailsPerPage", required = false, defaultValue="30") Integer numberOfTrailsPerPage) throws Exception {

        ResponseEntity<List<TrailOutput>> responseEntity;
        try{
            responseEntity = trailsService.getTrails(pageNumber, numberOfTrailsPerPage);
        }
        catch(Exception e){
            throw new ApiException(HttpStatus.BAD_REQUEST, "Not Found");
        }
        return responseEntity;
    }

    public ResponseEntity<TrailOutput> getTrailByID(@ApiParam(value = "The id of the trail",required=true) @PathVariable("id") Long id) throws Exception {

        ResponseEntity<TrailOutput> responseEntity;
        try{
            responseEntity = trailsService.getTrailByID(id);
        }
        catch(Exception e){
            throw new ApiException(HttpStatus.NOT_FOUND, "Trail not Found");
        }
        return responseEntity;
    }


    public ResponseEntity deleteTrailByID(@ApiParam(value = "trail that needs to be deleted",required=true) @PathVariable("id") Long id) throws Exception {

        ResponseEntity responseEntity;
        try{
            responseEntity = trailsService.deleteTrailByID(id);
        }
        catch(Exception e){
            throw new ApiException(HttpStatus.NOT_FOUND, "Fail to delete");
        }
        return responseEntity;
    }

    public ResponseEntity updateTrailByID(@ApiParam(value = "trail that need to be updated",required=true) @PathVariable("id") Long id,@ApiParam(value = "Updated Trail object" ,required=true )  @Valid @RequestBody Trail trail) throws Exception {

        ResponseEntity responseEntity;
        try{
            responseEntity = trailsService.updateTrailByID(id, trail);
        }
        catch(Exception e){
            throw new ApiException(HttpStatus.NOT_FOUND, "Fail to Update");
        }
        return responseEntity;
    }
}
