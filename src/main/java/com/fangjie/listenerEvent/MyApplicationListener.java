package com.fangjie.listenerEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 定义事件监听器
 */
//@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
    @Override
    public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        System.out.println("接收到事件："+myApplicationEvent.getClass());
    }
}
