package io.avalia.trailer.repositories;

import io.avalia.trailer.entities.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<UsersEntity, String> {
}
