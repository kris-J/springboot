package com.fangjie;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Config {

    //获取配置3
    @Value("${local.port}")
    private String localPort;

    @Autowired
    private Environment evn;

    //配置文件中不存在port.default，指定默认值
    @Value("${port.default:9090}")
    private String defaultPort;

    public void show() {
        System.out.println(evn.getProperty("local.ip"));
        System.out.println(localPort);
        System.out.println(evn.getProperty("app.name"));
        System.out.println(defaultPort);
    }
}
