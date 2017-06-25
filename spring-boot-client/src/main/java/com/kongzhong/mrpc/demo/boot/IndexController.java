package com.kongzhong.mrpc.demo.boot;

import com.kongzhong.mrpc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author biezhi
 *         25/06/2017
 */
@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String hello(@RequestParam(name = "msg", defaultValue = "默认测试数据") String msg) {
        return userService.hello(msg);
    }

}
