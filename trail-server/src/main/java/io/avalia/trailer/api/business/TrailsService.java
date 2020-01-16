package io.avalia.trailer.api.business;

import io.avalia.trailer.api.model.Trail;
import io.avalia.trailer.api.model.TrailOutput;
import io.avalia.trailer.api.model.TrailUpdate;
import io.avalia.trailer.entities.TrailsEntity;
import io.avalia.trailer.repositories.TrailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class TrailsService {

    @Autowired
    TrailsRepository trailsRepository;

    public ResponseEntity<Object> createTrail(Trail trail) {

        TrailsEntity newTrailsEntity = toTrailEntity(trail);
        trailsRepository.save(newTrailsEntity);
        Long id = newTrailsEntity.getId();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newTrailsEntity.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    public ResponseEntity<List<TrailOutput>> getTrails(Integer pageNumber, Integer numberOfTrails) {

        Pageable page = PageRequest.of(pageNumber,numberOfTrails);
        List<TrailOutput> trails = new ArrayList<>();
        for (TrailsEntity trailEntity : trailsRepository.findAll(page)) {
            trails.add(toTrail(trailEntity));
        }
        return ResponseEntity.ok(trails);
    }

    public ResponseEntity<TrailOutput> getTrailByID(Long id){

        Optional<TrailsEntity> ote = trailsRepository.findById(id);
        TrailsEntity te = ote.get();
        return ResponseEntity.ok(toTrail(te));
    }

    public ResponseEntity deleteTrailByID(Long id) {

        trailsRepository.deleteById(id);
        return ResponseEntity.ok("It has been delete!");
    }

    public ResponseEntity updateTrailByID(Long id, TrailUpdate trail) {

        Optional<TrailsEntity> oue = trailsRepository.findById(id);
        TrailsEntity ue = oue.get();
        ue.setName(trail.getName());
        ue.setDate(trail.getDate());
        ue.setDescription(trail.getDesprition());
        ue.setLength(trail.getLength());
        ue.setUpAndDown(trail.getUpAndDown());
        trailsRepository.save(ue);
        return ResponseEntity.ok("It has been update!");
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

    private TrailOutput toTrail(TrailsEntity entity) {
        TrailOutput trail = new TrailOutput();
        trail.setId(entity.getId());
        trail.setName(entity.getName());
        trail.setDesprition(entity.getDescription());
        trail.setLength(entity.getLength());
        trail.setUpAndDown(entity.getUpAndDown());
        trail.setDate(entity.getDate());
        return trail;
    }
}
