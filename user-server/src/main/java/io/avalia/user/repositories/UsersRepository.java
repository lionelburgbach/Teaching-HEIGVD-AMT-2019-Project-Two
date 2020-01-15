package io.avalia.user.repositories;

import io.avalia.user.entities.UsersEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UsersRepository extends CrudRepository<UsersEntity, String> {
//public interface UsersRepository extends PagingAndSortingRepository<UsersEntity, String> {

    //List<UsersEntity> findAllUsers(Pageable pageable);
}
