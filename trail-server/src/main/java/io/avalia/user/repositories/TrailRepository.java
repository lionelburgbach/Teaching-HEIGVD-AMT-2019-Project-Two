package io.avalia.user.repositories;

import io.avalia.user.entities.TrailEntity;
import org.springframework.data.repository.CrudRepository;

public interface TrailRepository  extends CrudRepository<TrailEntity, Long> {
}
