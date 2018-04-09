package com.fangjie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//@Component
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication springApplication) {
//        try {
//            InputStream input = new FileInputStream("file path");
//            Properties properties = new Properties();
//            properties.load(input);
//            PropertiesPropertySource propertySource = new PropertiesPropertySource("my",properties);
//            environment.getPropertySources().addLast(propertySource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
