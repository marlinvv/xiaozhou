package com.xiaozhou.weblog.web.controller;

import com.xiaozhou.weblog.common.enums.ResponseCodeEnum;
import com.xiaozhou.weblog.common.exception.BizException;
import com.xiaozhou.weblog.common.utils.JsonUtil;
import com.xiaozhou.weblog.common.utils.Response;
import com.xiaozhou.weblog.web.model.User;
import com.xiaozhou.weblog.common.aspect.ApiOperationLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.stream.Collectors;
/**
 * @author 小周
 * @date 2025/4/1 19:42
 * @description: TODO
 */
@RestController
@Slf4j
@Api(tags = "首页模块")
public class TestController {

    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    @ApiOperation(value = "测试接口")
    public Response test(@RequestBody @Validated User user) {
        // 打印入参
        log.info(JsonUtil.toJsonString(user));

        // 设置三种日期字段值
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateDate(LocalDate.now());
        user.setTime(LocalTime.now());

        return Response.success(user);
    }
}

