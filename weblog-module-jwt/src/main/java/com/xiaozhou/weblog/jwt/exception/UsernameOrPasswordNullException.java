package com.xiaozhou.weblog.jwt.exception;

import org.springframework.security.core.AuthenticationException;
/**
 * @author 小周
 * @date 2025/4/3 19:55
 * @description: 自定义用户名或密码不能为空异常
 */
public class UsernameOrPasswordNullException extends AuthenticationException {
    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}

