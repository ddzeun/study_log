package com.zeun.ramyun;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zeun.ramyun")
@EnableAspectJAutoProxy
public class ContextConfig {
}
