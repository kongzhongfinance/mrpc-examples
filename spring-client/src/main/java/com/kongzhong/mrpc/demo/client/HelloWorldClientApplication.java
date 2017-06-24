package com.kongzhong.mrpc.demo.client;

import com.kongzhong.mrpc.client.RpcSpringClient;
import com.kongzhong.mrpc.demo.service.UserService;

import java.util.concurrent.TimeUnit;

/**
 * RPC 客户端HelloWorld程序
 *
 * @author biezhi
 *         25/06/2017
 */
public class HelloWorldClientApplication {

    public static void main(String[] args) throws InterruptedException {

        RpcSpringClient rpcClient = new RpcSpringClient();
        // 设置连接服务端
        rpcClient.setDirectAddress("127.0.0.1:5066");

        UserService userService = rpcClient.getProxyReferer(UserService.class);

        for (int i = 1; i <= 10; i++) {
            String result = userService.hello("mrpc" + i);
            System.out.println("rpc返回：" + result);
            TimeUnit.SECONDS.sleep(2);
        }

        rpcClient.stop();
    }

}
