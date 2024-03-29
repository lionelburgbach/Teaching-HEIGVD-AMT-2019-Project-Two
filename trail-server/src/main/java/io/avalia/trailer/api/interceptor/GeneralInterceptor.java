package io.avalia.trailer.api.interceptor;

import io.avalia.trailer.api.exceptions.ApiException;
import io.avalia.trailer.entities.JwtToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class GeneralInterceptor implements HandlerInterceptor {

    @Autowired
    JwtToken jwt;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String owner = request.getServletPath().split("/")[2];
        String token = request.getHeader("Authorization").split(" ")[1];

        if(!(jwt.getRoleFromToken(token).equals("admin") || jwt.validateToken(token, owner))){
            throw new ApiException(HttpStatus.UNAUTHORIZED ,"You don't have rights to read/update/delete properties from this email: " + owner);
        }

        return true;
    }
}
