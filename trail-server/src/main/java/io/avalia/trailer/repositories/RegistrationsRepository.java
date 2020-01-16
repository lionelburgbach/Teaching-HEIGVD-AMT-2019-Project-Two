package io.avalia.trailer.repositories;

import io.avalia.trailer.entities.RegistrationsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;


public interface RegistrationsRepository extends PagingAndSortingRepository<RegistrationsEntity, Long> {

    Optional<RegistrationsEntity> findByIdUserAndIdTrail(Long idUser, Long idTrail);
    Page<RegistrationsEntity> findAllByIdUser(Long idUser, Pageable page);
}
