package com.Ecommerce.Controlleur;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        System.out.println("CORS configuration is applied.");
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:4200")
                .allowedHeaders("*")
                .exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Headers")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }

}
