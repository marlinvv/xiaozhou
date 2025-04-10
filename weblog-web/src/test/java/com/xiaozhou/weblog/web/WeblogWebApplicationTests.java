package com.xiaozhou.weblog.web;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class WeblogWebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testLog(){
        log.info("这是一行Info级别日志");
        log.warn("这是一行warn级别日志");
        log.error("这是一行error级别日志");

        //占位符
        String author = "小周";
        log .info("这是一行带有占位符日志，作者：{}",author);
    }

}
