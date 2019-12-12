package io.avalia.trailer.api.endpoints;

import io.avalia.trailer.api.TrailApi;
import io.avalia.trailer.api.model.Trail;
import io.avalia.trailer.entities.TrailEntity;
import io.avalia.trailer.repositories.TrailRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-26T19:36:34.802Z")

@Controller
public class TrailApiController implements TrailApi {

    @Autowired
    TrailRepository trailRepository;

    public ResponseEntity<Object> createTrail(@ApiParam(value = "", required = true) @Valid @RequestBody Trail trail) {
        TrailEntity newTrailEntity = toTrailEntity(trail);
        trailRepository.save(newTrailEntity);
        Long id = newTrailEntity.getId();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newTrailEntity.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    public ResponseEntity<List<Trail>> allTrails() {

        List<Trail> trails = new ArrayList<>();
        for (TrailEntity trailEntity : trailRepository.findAll()) {
            trails.add(toTrail(trailEntity));
        }
        return ResponseEntity.ok(trails);
    }

    public ResponseEntity<Trail> getTrailByID(Long id) {

        Optional<TrailEntity> ote = trailRepository.findById(id);
        TrailEntity te = ote.get();
        return ResponseEntity.ok(toTrail(te));
    }

    public ResponseEntity deleteTrail(Long id) {
        trailRepository.deleteById(id);
        return ResponseEntity.ok("ok");
    }

    /*
    public ResponseEntity<User>  updateUser(String email) {

        Optional<UserEntity> oue = userRepository.save(email);
        UserEntity ue = oue.get();
        return ResponseEntity.ok(toUser(ue));
    }
     */


    private TrailEntity toTrailEntity(Trail trail) {
        TrailEntity entity = new TrailEntity();
        entity.setName(trail.getName());
        entity.setLength(trail.getLength());
        entity.setDescription(trail.getDesprition());
        return entity;
    }

    private Trail toTrail(TrailEntity entity) {
        Trail trail = new Trail();
        trail.setName(entity.getName());
        trail.setDesprition(entity.getDescription());
        trail.setLength(entity.getLength());
        return trail;
    }
}
