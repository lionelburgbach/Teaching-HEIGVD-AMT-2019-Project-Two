package io.avalia.trailer.repositories;

import io.avalia.trailer.api.model.User;
import io.avalia.trailer.entities.UsersEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsersRepository extends PagingAndSortingRepository<UsersEntity, String> {

    User findById(Long id);
}
