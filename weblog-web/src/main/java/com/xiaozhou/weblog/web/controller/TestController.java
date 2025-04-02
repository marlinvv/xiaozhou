package com.xiaozhou.weblog.web.controller;

import com.xiaozhou.weblog.common.enums.ResponseCodeEnum;
import com.xiaozhou.weblog.common.exception.BizException;
import com.xiaozhou.weblog.common.utils.Response;
import com.xiaozhou.weblog.web.model.User;
import com.xiaozhou.weblog.common.aspect.ApiOperationLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;
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
    public Response test(@RequestBody @Validated User user) {
        return Response.success();
    }



}

