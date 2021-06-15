package com.douzone.hellospring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc // spring-servlet 를 대신 해주는 어노테이션
@ComponentScan({"com.douzone.hellospring.controller"}) // <context:component-scan> 
public class WebConfig {

}
