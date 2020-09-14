package com.example.configclient.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Men Huatao
 * @date 2020/8/24
 */
@Data
@Component
public class Config {

    @Value("${data.env}")
    private String env;

    @Value("${data.user}")
    private String user;

}
