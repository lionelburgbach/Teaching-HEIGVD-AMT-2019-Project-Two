package io.avalia.trailer.repositories;

import io.avalia.trailer.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> {
}
