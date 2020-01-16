package io.avalia.trailer.repositories;

import io.avalia.trailer.entities.RegistrationsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface RegistrationsRepository extends PagingAndSortingRepository<RegistrationsEntity, Long> {

    Page<RegistrationsEntity> findAllByIdUser(Long idUser, Pageable page);
}
