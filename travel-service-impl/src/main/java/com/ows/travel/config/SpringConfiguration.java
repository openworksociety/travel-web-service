package com.ows.travel.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ows.travel.service.*")
@EnableAutoConfiguration
public class SpringConfiguration {

}
