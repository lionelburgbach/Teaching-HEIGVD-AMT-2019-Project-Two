package io.avalia.trailer.api.interceptor;

import io.avalia.trailer.entities.JwtToken;
import io.avalia.trailer.api.exceptions.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TokenInterceptor implements HandlerInterceptor {

    @Autowired
    JwtToken jwt;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String header = request.getHeader("Authorization");
        if(header == null){
            throw new ApiException(HttpStatus.BAD_REQUEST, "No Authorization header!");
        }

        String token;
        try {
            token = request.getHeader("Authorization").split(" ")[1];
        }
        catch (Exception e){
            throw new ApiException(HttpStatus.BAD_REQUEST, "Bad token");
        }

        String name;
        try {
            name = jwt.getUsernameFromToken(token);
        }
        catch(Exception e) {
            throw new ApiException(HttpStatus.BAD_REQUEST, "Invalid SyntaxToken");
        }

        if(!jwt.validateToken(token, name)){
            throw new ApiException(HttpStatus.BAD_REQUEST, "Invalid Token");
        }

        return true;
    }
}
