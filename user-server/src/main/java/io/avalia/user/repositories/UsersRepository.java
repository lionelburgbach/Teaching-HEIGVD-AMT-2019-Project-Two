package io.avalia.user.repositories;

import io.avalia.user.entities.UsersEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsersRepository extends PagingAndSortingRepository<UsersEntity, String> {

    Page<UsersEntity> findAll(Pageable page);
}
