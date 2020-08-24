package com.example.configclient.controller;

import com.example.configclient.entity.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Men Huatao
 * @date 2020/8/24
 */
@RestController
@RequestMapping("/config")
public class ConfigController {
    private final Config config;

    @Autowired
    public ConfigController(Config config) {
        this.config = config;
    }

    @RequestMapping(value = "/show")
    public Object show() {
        return config;
    }
}
