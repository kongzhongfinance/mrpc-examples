package com.kongzhong.mrpc.demo.boot.service;

import com.kongzhong.mrpc.annotation.RpcService;
import com.kongzhong.mrpc.demo.model.NoConstructor;
import com.kongzhong.mrpc.demo.service.PayService;
import com.kongzhong.mrpc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @author biezhi
 *         25/06/2017
 */
@RpcService
public class PayServiceImpl implements PayService {

    @Autowired
    private UserService userService;

    @Override
    public String pay(String msg, BigDecimal money) {
        String result = userService.hello(msg);
        return result + "支付了" + money.doubleValue();
    }

    @Override
    public BigDecimal getMoney(Double money) {
        return null;
    }

    @Override
    public NoConstructor noConstructor(NoConstructor noConstructor) {
        return null;
    }
}
