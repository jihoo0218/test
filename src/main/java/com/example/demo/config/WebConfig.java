package com.example.demo.config;

import com.example.demo.interceptor.AccessControlInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private AccessControlInterceptor accessControlInterceptor;
    private List<String> accessControlParth = Arrays.asList(
            "/**/edit", "/**/update", "/**/write"
    );

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);

        registry.addInterceptor(accessControlInterceptor).addPathPatterns(accessControlParth);
    }
}
