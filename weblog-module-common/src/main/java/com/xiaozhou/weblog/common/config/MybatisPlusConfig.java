package com.xiaozhou.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 小周
 * @date 2025/4/3 17:23
 * @description: Mybatis Plus 配置文件
 */
@Configuration
@MapperScan("com.xiaozhou.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}
