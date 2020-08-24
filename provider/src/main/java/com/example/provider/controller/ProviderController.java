package com.example.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Men Huatao
 * @date 2020/7/31
 */
@RestController
@RequestMapping(value = "/provider")
public class ProviderController {
    private static final Logger logger = LoggerFactory.getLogger(ProviderController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello")
    public String hello() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            logger.info("service name : " + service);
        }
        return "Hello Spring Cloud";
    }
}
