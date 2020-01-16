package io.avalia.user.api.business;

import io.avalia.user.api.exceptions.ApiException;
import io.avalia.user.api.model.UserAuth;
import io.avalia.user.api.model.UserToken;
import io.avalia.user.entities.JwtToken;
import io.avalia.user.entities.UsersEntity;
import io.avalia.user.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuthService {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    JwtToken jwt;


    public String createAuthenticationToken(UserAuth user) throws Exception{

        if (user.getEmail() == null || user.getPassword() == null) {
            throw new ApiException(HttpStatus.BAD_REQUEST,"Email and Password cannot be null");
        }

        String email = user.getEmail();

        Optional<UsersEntity> userLoad = usersRepository.findById(email);
        if(!userLoad.isPresent()){
            throw new ApiException(HttpStatus.UNAUTHORIZED, "Bad Credentials");
        }

        UsersEntity ue = userLoad.get();
        String pwd = ue.getPassword();
        BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
        if (!bc.matches(user.getPassword(),pwd)) {
            throw new ApiException(HttpStatus.UNAUTHORIZED, "Bad Credentials");
        }

        return jwt.generateToken(toUserToken(ue));
    }

    private UserToken toUserToken(UsersEntity entity) {
        UserToken user = new UserToken();
        user.setRole(entity.getRole());
        user.setEmail(entity.getEmail());
        return user;
    }
}
