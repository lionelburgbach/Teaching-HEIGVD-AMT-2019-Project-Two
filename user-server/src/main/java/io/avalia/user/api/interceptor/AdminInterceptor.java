package io.avalia.user.api.interceptor;

import io.avalia.user.api.exceptions.ApiException;
import io.avalia.user.entities.JwtToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AdminInterceptor implements HandlerInterceptor {

    @Autowired
    JwtToken jwt;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String token = request.getHeader("Authorization").split(" ")[1];

        if(!jwt.getRoleFromToken(token).equals("admin")){
            throw new ApiException(HttpStatus.FORBIDDEN, "You don't have rights to create or read all user!");
        }

        return true;
    }

}
