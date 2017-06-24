package com.kongzhong.mrpc.demo.service;

import com.kongzhong.mrpc.interceptor.RpcServerInteceptor;
import com.kongzhong.mrpc.interceptor.ServerInvocation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author biezhi
 *         2017/4/24
 */
public class TestInterceptor2 implements RpcServerInteceptor {

    private static final Logger log = LoggerFactory.getLogger(TestInterceptor2.class);

    @Override
    public Object execute(ServerInvocation invocation) throws Exception {
        log.info("test interceptor2 execute.");
        Object obj = invocation.next();
        log.info("test interceptor2 execute, sleep 3s.");
        TimeUnit.SECONDS.sleep(3);
        return obj;
    }
}
