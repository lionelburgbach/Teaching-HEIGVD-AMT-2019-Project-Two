package io.avalia.trailer.api.endpoints;

import io.avalia.trailer.api.RegistrationsApi;
import io.avalia.trailer.api.business.RegistrationsService;
import io.avalia.trailer.api.exceptions.ApiException;
import io.avalia.trailer.api.model.RegistrationInput;
import io.avalia.trailer.api.model.RegistrationOutput;
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
public class RegistrationsApiController implements RegistrationsApi {

    @Autowired
    RegistrationsService registrationsService;

    public ResponseEntity<Object> createRegistration(@ApiParam(value = "email from the user",required=true) @PathVariable("email") String email,@ApiParam(value = "" ,required=true )  @Valid @RequestBody RegistrationInput registration) throws Exception {

        return registrationsService.createRegistration(email, registration);
    }

    public ResponseEntity<List<RegistrationOutput>> getRegistrationsByIdUser(@ApiParam(value = "All registration for this user ",required=true) @PathVariable("email") String email,@ApiParam(value = "", defaultValue = "0") @Valid @RequestParam(value = "PageNumber", required = false, defaultValue="0") Integer pageNumber,@ApiParam(value = "", defaultValue = "30") @Valid @RequestParam(value = "numberOfRegistration", required = false, defaultValue="30") Integer numberOfRegistration) throws Exception {

        return registrationsService.getRegistrationsByIdUser(email, pageNumber, numberOfRegistration);
    }

    public ResponseEntity deleteRegistrationByID(@ApiParam(value = "", required = true) @PathVariable("email") String email, @RequestParam("id")  Long id) throws Exception {

        ResponseEntity responseEntity;
        try{
            responseEntity = registrationsService.deleteRegistrationByID(email, id);
        }
        catch(Exception e){
            throw new ApiException(HttpStatus.NOT_FOUND, "Fail to delete");
        }
        return responseEntity;
    }
}
