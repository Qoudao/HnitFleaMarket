package org.hnitacm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: HnitFleaMarket
 * @description: 启动类
 * @author: Leo
 * @date: 2020-05-16 16:34
 **/

@SpringBootApplication
@MapperScan("org.hnitacm.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
