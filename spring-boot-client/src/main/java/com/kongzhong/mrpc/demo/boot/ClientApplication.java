package com.kongzhong.mrpc.demo.boot;

import com.kongzhong.mrpc.client.Referers;
import com.kongzhong.mrpc.demo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author biezhi
 *         25/06/2017
 */
@SpringBootApplication
public class ClientApplication {

    @Bean
    public Referers referers() {
        return new Referers().add(UserService.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}
