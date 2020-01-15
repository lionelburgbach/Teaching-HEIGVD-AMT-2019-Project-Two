package io.avalia.user.api.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class InterceptorAppConfig implements WebMvcConfigurer {

    @Autowired
    TokenInterceptor tokenInterceptor;

    @Autowired
    UsersInterceptor usersInterceptor;

    @Autowired
    AdminInterceptor adminInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tokenInterceptor).addPathPatterns("/users", "/users/*").order(1);
        registry.addInterceptor(usersInterceptor).addPathPatterns("/users/*").order(2);
        registry.addInterceptor(adminInterceptor).addPathPatterns("/users").order(2);
    }
}
