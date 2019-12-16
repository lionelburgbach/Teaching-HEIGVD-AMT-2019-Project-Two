package io.avalia.user.repositories;

import io.avalia.user.entities.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<UsersEntity, String> {
}
