package io.avalia.trailer.api.endpoints;

import io.avalia.trailer.api.RegistrationApi;
import io.avalia.trailer.api.model.Registration;
import io.avalia.trailer.entities.RegistrationEntity;
import io.avalia.trailer.repositories.RegistrationRepository;
import io.avalia.trailer.repositories.TrailRepository;
import io.avalia.trailer.repositories.UsersRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")

@Controller
public class RegistrationApiController implements RegistrationApi {

    @Autowired
    RegistrationRepository regRepository;

    @Autowired
    TrailRepository trailRepository;

    @Autowired
    UsersRepository usersRepository;

    public ResponseEntity<Object> createRegistration(@ApiParam(value = "", required = true) @Valid @RequestBody Registration reg) {
        RegistrationEntity newRegEntity = toRegistrationEntity(reg);
        regRepository.save(newRegEntity);
        Long id = newRegEntity.getId();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newRegEntity.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    public ResponseEntity<Registration> getRegistrationByID(Long id) {

        Optional<RegistrationEntity> ore = regRepository.findById(id);
        RegistrationEntity re = ore.get();
        return ResponseEntity.ok(toRegistration(re));
    }

    public ResponseEntity deleteRegistration(Long id) {
        regRepository.deleteById(id);
        return ResponseEntity.ok("ok");
    }

    private RegistrationEntity toRegistrationEntity(Registration reg) {
        RegistrationEntity entity = new RegistrationEntity();
        entity.setIdTrail(reg.getIdTrail());
        entity.setIdUser(reg.getIdUser());
        return entity;
    }

    private Registration toRegistration(RegistrationEntity entity) {
        Registration reg = new Registration();
        reg.setIdTrail(entity.getIdTrail());
        reg.setIdUser(entity.getIdUser());
        return reg;
    }
}
