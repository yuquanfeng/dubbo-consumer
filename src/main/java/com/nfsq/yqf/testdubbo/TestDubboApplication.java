package com.nfsq.yqf.testdubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@ComponentScan
public class TestDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestDubboApplication.class, args);
    }
}
