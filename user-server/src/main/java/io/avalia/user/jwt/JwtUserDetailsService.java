package io.avalia.user.jwt;

import io.avalia.user.api.model.UserAuth;
import io.avalia.user.entities.UsersEntity;
import io.avalia.user.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UsersRepository userRepository;

    public User loadUserByUsername(String email) throws UsernameNotFoundException {

        Optional<UsersEntity> oe = userRepository.findById(email);
        UsersEntity user = oe.get();
        UserAuth userAuth = toUserAuth(user);
        if (userAuth == null) {
            throw new UsernameNotFoundException("User not found with username: " + email);
        }
        return new org.springframework.security.core.userdetails.User(userAuth.getEmail(), userAuth.getPassword(),
                new ArrayList<>());
    }

    private UserAuth toUserAuth(UsersEntity entity) {
        UserAuth user = new UserAuth();
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        return user;
    }
}