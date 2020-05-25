package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/25 23:50
 * @history: 1.2020/5/25 created by liangjun.wu
 */
@RestController
@RequestMapping("/api")
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public void test(){
        System.out.println("这是一个测试案例");
    }
}
