package com.cognixia.jump.springcloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;

@Configuration

public class WebConfig {

    public void addCorsMappings(CorsRegistry registry) {
    	registry.addMapping("/**")
    			.allowedMethods("*")
    			.allowedOrigins("*");
    }
}
