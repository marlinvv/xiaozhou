package com.xiaozhou.weblog.common.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;

import java.util.List;
import java.util.Objects;

/**
 * @author 小周
 * @date 2025/4/9 14:30
 * @description: 分页响应类
 */
@Data
public class PageResponse<T> extends Response<List<T>> {

    /**
     * 总记录数
     */
    private long total = 0L;

    /**
     * 每页显示的记录数，默认每页显示 10 条
     */
    private long size = 10L;

    /**
     * 当前页码
     */
    private long current;

    /**
     * 总页数
     */
    private long pages;

    /**
     * 成功响应
     * @param page Mybatis Plus 提供的分页接口
     * @param data
     * @return
     * @param <T>
     */
    public static <T> PageResponse<T> success(IPage page, List<T> data) {
        PageResponse<T> response = new PageResponse<>();
        response.setSuccess(true);
        response.setCurrent(Objects.isNull(page) ? 1L : page.getCurrent());
        response.setSize(Objects.isNull(page) ? 10L : page.getSize());
        response.setPages(Objects.isNull(page) ? 0L : page.getPages());
        response.setTotal(Objects.isNull(page) ? 0L : page.getTotal());
        response.setData(data);
        return response;
    }


}

