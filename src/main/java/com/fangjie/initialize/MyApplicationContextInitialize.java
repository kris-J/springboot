package com.fangjie.initialize;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

public class MyApplicationContextInitialize implements ApplicationContextInitializer<ConfigurableApplicationContext>{
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("bean count"+configurableApplicationContext.getBeanDefinitionCount());
    }
}
