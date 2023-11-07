package com.aixu.global.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.persistence.EntityManager;

/**
 * @Author 冠旭
 * @Date 2023/11/7 20:46
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Bean
    public JPAQueryFactory jpaQuery(EntityManager entityManager){
        return new JPAQueryFactory(entityManager);
    }
}
