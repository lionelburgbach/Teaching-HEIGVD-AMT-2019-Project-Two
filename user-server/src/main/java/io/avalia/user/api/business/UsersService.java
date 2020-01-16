package io.avalia.user.api.business;

import io.avalia.user.api.exceptions.ApiException;
import io.avalia.user.api.model.UserInput;
import io.avalia.user.api.model.UserToken;
import io.avalia.user.entities.UsersEntity;
import io.avalia.user.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    public ResponseEntity<Object> createUser(UserInput user) throws Exception{

        UsersEntity newUserEntity = toUserEntity(user);
        if (usersRepository.existsById(user.getEmail())){
            throw new ApiException(HttpStatus.BAD_REQUEST, "This email already exist!");
        }

        newUserEntity.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        usersRepository.save(newUserEntity);
        Long id = newUserEntity.getId();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(newUserEntity.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    public ResponseEntity<UserToken> getUserByID(String email) throws Exception{

        Optional<UsersEntity> oue = usersRepository.findById(email);
        UsersEntity ue = oue.get();
        return ResponseEntity.ok(toUserToken(ue));
    }

    public ResponseEntity deleteUserByID(String email){

        usersRepository.deleteById(email);
        return ResponseEntity.ok("It has been delete!");
    }

    public ResponseEntity updatePasswordByID(String email, String password) {

        Optional<UsersEntity> oue = usersRepository.findById(email);
        UsersEntity ue = oue.get();
        ue.setPassword(new BCryptPasswordEncoder().encode(password));
        usersRepository.save(ue);
        return ResponseEntity.ok("It has been update!");
    }

    public ResponseEntity<List<UserToken>> getUsers(Integer pageNumber, Integer numberOfUsers) {

        Pageable page = PageRequest.of(pageNumber,numberOfUsers);
        List<UserToken> users = new ArrayList<>();
        for (UsersEntity userEntity : usersRepository.findAll(page)) {
            users.add(toUserToken(userEntity));
        }
        return ResponseEntity.ok(users);
    }

    private UserToken toUserToken(UsersEntity entity) {
        UserToken user = new UserToken();
        user.setEmail(entity.getEmail());
        user.setRole(entity.getRole());
        return user;
    }

    private UsersEntity toUserEntity(UserInput user) {
        UsersEntity entity = new UsersEntity();
        entity.setPassword(user.getPassword());
        entity.setRole(user.getRole());
        entity.setEmail(user.getEmail());
        return entity;
    }
}
