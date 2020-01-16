package io.avalia.trailer.api.endpoints;

import io.avalia.trailer.api.RegistrationsApi;
import io.avalia.trailer.api.model.Registration;
import io.avalia.trailer.api.model.RegistrationOutput;
import io.avalia.trailer.entities.RegistrationsEntity;
import io.avalia.trailer.entities.TrailsEntity;
import io.avalia.trailer.entities.UsersEntity;
import io.avalia.trailer.entities.JwtToken;
import io.avalia.trailer.repositories.RegistrationsRepository;
import io.avalia.trailer.repositories.TrailsRepository;
import io.avalia.trailer.repositories.UsersRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")

@Controller
public class RegistrationsApiController implements RegistrationsApi {

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

    public ResponseEntity<List<RegistrationOutput>> getRegistrationByIdUser(String email){

        if(!jwt.validateToken(getToken(), email)){
            return ResponseEntity.status(401).build();
        }

        Optional<UsersEntity> oue = usersRepository.findById(email);
        UsersEntity user = oue.get();

        List<RegistrationOutput> regs = new ArrayList<>();
        for (RegistrationsEntity regEntity : regRepository.findByIdUser(user.getId())) {

            Optional<TrailsEntity> ote = trailsRepository.findById(regEntity.getIdTrail());
            TrailsEntity te = ote.get();
            te.getName();
            RegistrationOutput ro = new RegistrationOutput();
            ro.setEmail(email);
            ro.setTrailName(te.getName());
            ro.setIdReg(regEntity.getId());

            regs.add(ro);
        }

        return ResponseEntity.ok(regs);
    }

    public ResponseEntity deleteRegistrationByID(@ApiParam(value = "", required = true) @PathVariable("email") String email, @RequestParam("id")  Long id) {

        if(!jwt.validateToken(getToken(), email)){
            return ResponseEntity.status(401).build();
        }

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

        String bearer = null;
        if(request.getHeader("Authorization") == null){
            throw new IllegalArgumentException("No Authorization header!");
        }
        else{
            bearer = request.getHeader("Authorization");
        }
        return bearer;
    }
}
