package com.kongzhong.mrpc.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * [推荐] 使用 @RpcService 注解暴露服务端程序
 *
 * @author biezhi
 *         25/06/2017
 */
public class AnnotationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("mrpc-server-annotation.xml");
        ctx.registerShutdownHook();
        ctx.start();
    }

}
