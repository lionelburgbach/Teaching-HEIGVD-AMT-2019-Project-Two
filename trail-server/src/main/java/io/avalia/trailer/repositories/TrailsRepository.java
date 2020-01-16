package io.avalia.trailer.repositories;

import io.avalia.trailer.entities.TrailsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TrailsRepository extends PagingAndSortingRepository<TrailsEntity, Long> {

    Page<TrailsEntity> findAll(Pageable page);
}
