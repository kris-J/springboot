package com.fangjie.commandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class ServerSuccessReport implements CommandLineRunner{
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("成功启动");
    }
}
