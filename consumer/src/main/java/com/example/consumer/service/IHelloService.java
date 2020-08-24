package com.example.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Men Huatao
 * @date 2020/7/31
 */
@FeignClient("eureka-provider")
public interface IHelloService {

    // 通过Feign的声明找到eureka-provider的/hello
    @RequestMapping(value = "/provider/hello")
    String hello();
}
