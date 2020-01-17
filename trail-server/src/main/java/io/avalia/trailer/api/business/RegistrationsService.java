package io.avalia.trailer.api.business;

import io.avalia.trailer.api.exceptions.ApiException;
import io.avalia.trailer.api.model.RegistrationInput;
import io.avalia.trailer.api.model.RegistrationOutput;
import io.avalia.trailer.entities.RegistrationsEntity;
import io.avalia.trailer.entities.TrailsEntity;
import io.avalia.trailer.entities.UsersEntity;
import io.avalia.trailer.repositories.RegistrationsRepository;
import io.avalia.trailer.repositories.TrailsRepository;
import io.avalia.trailer.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class RegistrationsService {

    @Autowired
    RegistrationsRepository regRepository;

    @Autowired
    TrailsRepository trailsRepository;

    @Autowired
    UsersRepository usersRepository;

    public ResponseEntity<Object> createRegistration(String email, RegistrationInput reg) throws Exception {

        Optional<UsersEntity> oue = usersRepository.findById(email);
        if(!oue.isPresent()){
            throw new ApiException(HttpStatus.BAD_REQUEST, "This user doesn't exist!");
        }
        UsersEntity user = oue.get();

        Optional<TrailsEntity> ote = trailsRepository.findById(reg.getIdTrail());
        if(!ote.isPresent()){
            throw new ApiException(HttpStatus.BAD_REQUEST, "This trail doesn't exists!");
        }

        Optional<RegistrationsEntity> oReg  = regRepository.findByIdUserAndIdTrail(user.getId(), reg.getIdTrail());
        if(!oReg.isPresent()){
            throw new ApiException(HttpStatus.BAD_REQUEST, "This registration already exist!");
        }

        RegistrationsEntity newRegEntity = toRegistrationEntity(user.getId(),reg);
        regRepository.save(newRegEntity);
        Long id = newRegEntity.getId();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newRegEntity.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    public ResponseEntity<List<RegistrationOutput>> getRegistrationsByIdUser(String email, Integer pageNumber, Integer numberOfRegistrationsPerPage) throws Exception {

        Optional<UsersEntity> oue = usersRepository.findById(email);
        if(!oue.isPresent()){
            throw new ApiException(HttpStatus.BAD_REQUEST, "This user doesn't exist!");
        }

        UsersEntity user = oue.get();


        Pageable page = PageRequest.of(pageNumber,numberOfRegistrationsPerPage);
        List<RegistrationOutput> regs = new ArrayList<>();
        for (RegistrationsEntity regEntity : regRepository.findAllByIdUser(user.getId(),page)) {

            Optional<TrailsEntity> ote = trailsRepository.findById(regEntity.getIdTrail());
            TrailsEntity te = ote.get();
            te.getName();
            RegistrationOutput ro = new RegistrationOutput();
            ro.setIdTrail(te.getId());
            ro.setEmail(email);
            ro.setTrailName(te.getName());
            ro.setIdReg(regEntity.getId());

            regs.add(ro);
        }
        return ResponseEntity.ok(regs);
    }

    public ResponseEntity deleteRegistrationByID(String email, Long id) {

        regRepository.deleteById(id);
        return ResponseEntity.ok("It has been delete!");
    }

    private RegistrationsEntity toRegistrationEntity(long idUser, RegistrationInput reg) {
        RegistrationsEntity entity = new RegistrationsEntity();
        entity.setIdTrail(reg.getIdTrail());
        entity.setIdUser(idUser);
        return entity;
    }
}
