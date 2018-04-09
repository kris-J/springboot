package com.fangjie.jdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JdbcConfig {

    @Value("${mysql.url}")
    private String url;

    @Value("${mysql.username}")
    private String username;

    public void show(){
        System.out.println(url);
        System.out.println(username);
    }
}
