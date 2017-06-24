package com.kongzhong.mrpc.demo.client;

import com.kongzhong.mrpc.client.RpcSpringClient;
import com.kongzhong.mrpc.demo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * RPC 客户端HelloWorld程序
 *
 * @author biezhi
 *         25/06/2017
 */
public class ZookeeperClientApplication {

    public static void main(String[] args) throws InterruptedException {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("mrpc-client-zookeeper.xml");
        RpcSpringClient client = ctx.getBean(RpcSpringClient.class);

        UserService userService = client.getProxyReferer(UserService.class);

        for (int i = 1; i <= 3; i++) {
            String result = userService.hello("mrpc" + i);
            System.out.println("rpc返回：" + result);
            TimeUnit.SECONDS.sleep(2);
        }

        client.shutdown();

    }

}
