package io.avalia.trailer.repositories;

import io.avalia.trailer.entities.RegistrationsEntity;
import org.springframework.data.repository.CrudRepository;

public interface RegistrationsRepository extends CrudRepository<RegistrationsEntity, Long> {
}
