package com.xiaozhou.weblog.common.model;

import lombok.Data;

/**
 * @author 小周
 * @date 2025/4/9 14:31
 * @description: 封装分页请求基础类
 */
@Data
public class BasePageQuery {
    /**
     * 当前页码, 默认第一页
     */
    private Long current = 1L;
    /**
     * 每页展示的数据数量，默认每页展示 10 条数据
     */
    private Long size = 10L;
}


