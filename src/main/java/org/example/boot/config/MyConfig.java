package org.example.boot.config;


import org.example.boot.bean.Pet;
import org.example.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public User user01(){
        return new User("zhangshan", 18);
    }
    @Bean("tom")
    public Pet tomcat(){
        return new Pet("tomcat");
    }
}
