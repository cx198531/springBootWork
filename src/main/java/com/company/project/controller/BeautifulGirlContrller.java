package com.company.project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * 测试获取配置文件参数方法1常用
 * @author user
 *
 */
@RestController
@RequestMapping
public class BeautifulGirlContrller {

    @Value("${cubSize}")
    private String cubSize;

    @Value("${age}")
    private Integer age;

    @RequestMapping(value = "/gril",method = RequestMethod.GET)
    public String HelloGril(){
        return cubSize + age;
    }


    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    public String Test1(){
        return "test1111";
    }
    
    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    public String Test2(){
        return "test2";
    }
}
