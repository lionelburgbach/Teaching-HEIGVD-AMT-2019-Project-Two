package io.avalia.user.api.interceptor;

import io.avalia.user.api.exceptions.ApiException;
import io.avalia.user.jwt.JwtToken;
import org.springframework.beans.factory.annotation.Autowired;
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
            throw new ApiException(401, "No Authorization header!");
        }

        String token;
        try {
            token = request.getHeader("Authorization").split(" ")[1];
        }
        catch (Exception e){
            throw new ApiException(400, "Bad token");
        }

        String name;
        try {
            name = jwt.getUsernameFromToken(token);
        }
        catch(Exception e) {
            throw new ApiException(401, "Invalid Token");
        }

        if(!jwt.validateToken(token, name)){
            throw new ApiException(401, "Invalid Token");
        }

        return true;
    }
}
