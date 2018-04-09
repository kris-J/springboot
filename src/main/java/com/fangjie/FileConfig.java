package com.fangjie;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//加载多个配置文件
@PropertySources(@PropertySource("classpath:jdbc.properties"))
public class FileConfig {
}
