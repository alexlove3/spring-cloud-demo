package com.example.consumer.controller;

import com.example.consumer.service.IHelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Men Huatao
 * @date 2020/7/31
 */
@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private IHelloService helloService;

    @RequestMapping(value = "/hello")
    public String hello() {
        String result = helloService.hello();
        logger.info("Consumer request result : {}", result);
        return result;
    }
}
