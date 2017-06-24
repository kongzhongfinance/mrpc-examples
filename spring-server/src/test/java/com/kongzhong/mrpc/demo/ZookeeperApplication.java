package com.kongzhong.mrpc.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 将服务注册在Zookeeper上
 *
 * @author biezhi
 *         25/06/2017
 */
public class ZookeeperApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("mrpc-server-zookeeper.xml");
        ctx.registerShutdownHook();
        ctx.start();
    }

}
