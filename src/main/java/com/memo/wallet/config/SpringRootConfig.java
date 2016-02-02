package com.memo.wallet.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.memo.wallet.service" })
public class SpringRootConfig {
}