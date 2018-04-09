package com.fangjie.commandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class ServerSuccessReport3 implements CommandLineRunner,Ordered{
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("成功启动ordered接口方式");
    }

    @Override
    public int getOrder() {
        return 10;
    }
}
