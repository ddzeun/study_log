package com.zeun.ramyun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
        RamyunService ramyunService = context.getBean(RamyunService.class);

        ramyunService.cookRamyun();
    }
}
