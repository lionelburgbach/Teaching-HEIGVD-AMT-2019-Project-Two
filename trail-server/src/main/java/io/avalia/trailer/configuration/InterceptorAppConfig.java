package io.avalia.trailer.configuration;

import io.avalia.trailer.api.interceptor.AdminInterceptor;
import io.avalia.trailer.api.interceptor.TokenInterceptor;
import io.avalia.trailer.api.interceptor.GeneralInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class InterceptorAppConfig implements WebMvcConfigurer {

    @Autowired
    TokenInterceptor tokenInterceptor;

    @Autowired
    AdminInterceptor adminInterceptor;

    @Autowired
    GeneralInterceptor generalInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tokenInterceptor).addPathPatterns("/users", "/users/*","/registrations","/registrations/*","/trails","/trails/*").order(1);
        registry.addInterceptor(generalInterceptor).addPathPatterns("/users/*","/registrations","/registrations/*").order(2);
        registry.addInterceptor(adminInterceptor).addPathPatterns("/users").order(2);
    }
}
