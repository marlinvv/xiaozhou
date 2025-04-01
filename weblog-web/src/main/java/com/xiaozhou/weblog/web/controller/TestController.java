package com.xiaozhou.weblog.web.controller;

import com.xiaozhou.weblog.web.model.User;
import com.xiaozhou.weblog.common.aspect.ApiOperationLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author 小周
 * @date 2025/4/1 19:42
 * @description: TODO
 */
@RestController
@Slf4j
public class TestController {

    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public User test(@RequestBody User user){
        //反参
        return user;
    }
}
