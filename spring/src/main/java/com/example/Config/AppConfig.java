package com.example.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.Alein;
import com.example.laptop;

@Configuration
public class AppConfig {


    @Bean
    public Alien alien(){
        Alien obj = new Alein();
        obj.setAge(22);
        return obj;
    }

    @Bean()
    @Scope("prototype")
    public laptop laptop(){
        return new laptop();
    }    
}
