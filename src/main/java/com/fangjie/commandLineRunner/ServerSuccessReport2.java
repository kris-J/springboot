package com.fangjie.commandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Order(2)
@Component
public class ServerSuccessReport2 implements CommandLineRunner{
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("成功启动xxxxx");
    }
}
