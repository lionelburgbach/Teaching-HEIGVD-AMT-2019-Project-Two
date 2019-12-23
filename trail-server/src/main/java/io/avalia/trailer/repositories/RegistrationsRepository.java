package io.avalia.trailer.repositories;

import io.avalia.trailer.api.model.Registration;
import io.avalia.trailer.entities.RegistrationsEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RegistrationsRepository extends CrudRepository<RegistrationsEntity, Long> {

    List<RegistrationsEntity> findByIdUser(Long idUser);
}
