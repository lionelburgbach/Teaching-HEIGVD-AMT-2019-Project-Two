package io.avalia.trailer.api.endpoints;

import io.avalia.trailer.api.TrailsApi;
import io.avalia.trailer.api.model.Trail;
import io.avalia.trailer.entities.TrailsEntity;
import io.avalia.trailer.jwt.JwtToken;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")
@Controller
public class TrailsApiController implements TrailsApi {

    @Autowired
    TrailsRepository trailsRepository;

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    JwtToken jwt;

    @Autowired
    HttpServletRequest request;

    public ResponseEntity<Object> createTrail(@ApiParam(value = "", required = true) @Valid @RequestBody Trail trail) {

        String email = jwt.getUsernameFromToken(getToken());
        if(!usersRepository.existsById(email)){
            return ResponseEntity.status(401).build();
        }

        TrailsEntity newTrailsEntity = toTrailEntity(trail);
        trailsRepository.save(newTrailsEntity);
        Long id = newTrailsEntity.getId();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newTrailsEntity.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    public ResponseEntity<List<Trail>> allTrails() {

        List<Trail> trails = new ArrayList<>();
        for (TrailsEntity trailsEntity : trailsRepository.findAll()) {
            trails.add(toTrail(trailsEntity));
        }
        return ResponseEntity.ok(trails);
    }

    public ResponseEntity<Trail> getTrailByID(Long id) {

        Optional<TrailsEntity> ote = trailsRepository.findById(id);
        TrailsEntity te = ote.get();
        return ResponseEntity.ok(toTrail(te));
    }


    public ResponseEntity deleteTrail(Long id) {

        String email = jwt.getUsernameFromToken(getToken());
        if(!usersRepository.existsById(email)){
            return ResponseEntity.status(401).build();
        }

        trailsRepository.deleteById(id);
        return ResponseEntity.ok("ok");
    }

    private TrailsEntity toTrailEntity(Trail trail) {
        TrailsEntity entity = new TrailsEntity();
        entity.setName(trail.getName());
        entity.setLength(trail.getLength());
        entity.setDescription(trail.getDesprition());
        entity.setUpAndDown(trail.getUpAndDown());
        entity.setDate(trail.getDate());
        return entity;
    }

    private Trail toTrail(TrailsEntity entity) {
        Trail trail = new Trail();
        trail.setName(entity.getName());
        trail.setDesprition(entity.getDescription());
        trail.setLength(entity.getLength());
        trail.setUpAndDown(entity.getUpAndDown());
        trail.setDate(entity.getDate());
        return trail;
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
