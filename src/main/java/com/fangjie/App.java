package com.fangjie;

import com.fangjie.listenerEvent.MyApplicationEvent;
import com.fangjie.listenerEvent.MyApplicationListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync  //@Enable*注解为启用某一个功能
@SpringBootApplication
public class App {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(App.class);
//        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        //获取配置1
//        System.out.println(context.getEnvironment().getProperty("local.ip"));
//        //获取配置2
//        context.getBean(Config.class).show();
//
//        context.getBean(JdbcConfig.class).show();
//
//        //获取运行环境
//        System.out.println(context.getEnvironment().getProperty("jdbc.url"));
//
//        //conditional注解
//        System.out.println(System.getProperty("file.encoding"));
//        ConditionConfig encoding = context.getBean(ConditionConfig.class);
//        System.out.println(encoding.encoding);
//
//        //enable注解
//        System.out.println("-------enable注解-------");
//        // 注意是Runnable class
//        context.getBean(Runnable.class).run();
//        System.out.println("-------end-------");

        //添加事件监听器,添加监听要在run之前
//        app.addListeners(new MyApplicationListener());
        ConfigurableApplicationContext context = app.run(args);
        //发布事件
        context.publishEvent(new MyApplicationEvent(new Object()));

        context.close();
    }

}
