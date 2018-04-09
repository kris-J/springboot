package com.fangjie.condition;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 *  @Conditional注解在方法上，只针对该方法生效，在类上则对该类下所有方法生效
 *  @Conditional可用数组方式进行多条件判断，同时满足
 */
@SpringBootConfiguration
public class ConditionConfig {

    public String encoding;

    @Bean
    @Conditional(UTFCondition.class)
    public EncodingInterface createUTFEncoding(){
        this.encoding = "utf-8";
        return new UTFEncodingImp();
    }


    @Bean
    @Conditional(GBKCondition.class)
    public EncodingInterface createGBKEncoding(){
        this.encoding = "gbk";
        return new GBKEncodingImp();
    }

}
