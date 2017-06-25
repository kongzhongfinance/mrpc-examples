package com.kongzhong.mrpc.demo.boot;

import com.kongzhong.mrpc.client.Referers;
import com.kongzhong.mrpc.demo.service.PayService;
import com.kongzhong.mrpc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

/**
 * 服务端和客户端共存，请先开启 spring-boot-server/ServerApplication 确保可以连接服务端
 *
 * @author biezhi
 *         25/06/2017
 */
@SpringBootApplication
public class ServerAndClientApplication {

    @Bean
    public Referers referers() {
        return new Referers().add(UserService.class);
    }

    @Bean
    @ConditionalOnBean(PayService.class)
    public CommandLineRunner commandLineRunner(@Autowired PayService payService) {
        return args -> System.out.println(payService.pay("王爵nice", new BigDecimal("20.17")));
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerAndClientApplication.class, args);
    }

}
