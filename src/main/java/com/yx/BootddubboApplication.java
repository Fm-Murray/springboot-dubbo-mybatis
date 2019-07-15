package com.yx;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
@DubboComponentScan("com.yx.service.*")
@MapperScan(value = "com.yx.mapper")
public class BootddubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootddubboApplication.class, args);
    }

}
