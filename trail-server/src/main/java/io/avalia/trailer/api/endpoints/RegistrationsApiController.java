package io.avalia.trailer.api.endpoints;

import io.avalia.trailer.api.RegistrationApi;
import io.avalia.trailer.api.model.Registration;
import io.avalia.trailer.entities.RegistrationsEntity;
import io.avalia.trailer.jwt.JwtToken;
import io.avalia.trailer.repositories.RegistrationsRepository;
import io.avalia.trailer.repositories.TrailsRepository;
import io.avalia.trailer.repositories.UsersRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")

@Controller
public class RegistrationsApiController implements RegistrationApi {

    @Autowired
    RegistrationsRepository regRepository;

    @Autowired
    TrailsRepository trailsRepository;

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    JwtToken jwt;

    @Autowired
    HttpServletRequest request;

    public ResponseEntity<Object> createRegistration(@ApiParam(value = "", required = true) @Valid @RequestBody Registration reg) {

        String email = jwt.getUsernameFromToken(getToken());
        if(!usersRepository.existsById(email)){
            return ResponseEntity.status(401).build();
        }

        RegistrationsEntity newRegEntity = toRegistrationEntity(reg);
        regRepository.save(newRegEntity);
        Long id = newRegEntity.getId();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newRegEntity.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    public ResponseEntity<Registration> getRegistrationByID(Long id) {

        Optional<RegistrationsEntity> ore = regRepository.findById(id);
        RegistrationsEntity re = ore.get();


        return ResponseEntity.ok(toRegistration(re));
    }

    public ResponseEntity deleteRegistration(Long id) {
        regRepository.deleteById(id);
        return ResponseEntity.ok("ok");
    }

    private RegistrationsEntity toRegistrationEntity(Registration reg) {
        RegistrationsEntity entity = new RegistrationsEntity();
        entity.setIdTrail(reg.getIdTrail());
        entity.setIdUser(reg.getIdUser());
        return entity;
    }

    private Registration toRegistration(RegistrationsEntity entity) {
        Registration reg = new Registration();
        reg.setIdTrail(entity.getIdTrail());
        reg.setIdUser(entity.getIdUser());
        return reg;
    }

    private String getToken(){

        String bearer = request.getHeader("Authorization");
        if(bearer.length() < 7) {
            throw new IllegalArgumentException("No Token");
        }
        String token = bearer.substring(7);
        return token;
    }
}