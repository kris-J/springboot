事件监听
1.自定义事件类，继承ApplicationEvent抽象类
2.自定义事件监听类，实现ApplicationListener接口
3.配置监听器，启动的时候，需要把监听器加入到spring容器中
4.发布事件，使用ApplicationContext.publishEvent方法


配置监听器方法：
1.SpringApplication addListeners
2.Listener添加@Component注解纳入到spring容器中管理
3.使用配置文件项,application.properties中配置：context.listener.classes=com.fangjie.listenerEvent.MyApplicationListener
4.使用@EventListener注解，且该类需要添加@Component注解纳入到spring容器中管理
5.使用spring.factories机制