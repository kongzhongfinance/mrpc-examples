package com.kongzhong.mrpc.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * HelloWorld MRPC服务端程序
 * <p>
 * 该程序会暴露一个 @see{com.kongzhong.mrpc.demo.service.UserService}
 *
 * @author biezhi
 *         25/06/2017
 */
public class HelloWorldApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("mrpc-server.xml");
        ctx.registerShutdownHook();
        ctx.start();
    }

}
