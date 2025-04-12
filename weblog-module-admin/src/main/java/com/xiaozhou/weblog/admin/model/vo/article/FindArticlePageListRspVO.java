package com.xiaozhou.weblog.admin.model.vo.article;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author 小周
 * @date 2025/4/12 21:23
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindArticlePageListRspVO  {

    /**
     * 文章 ID
     */
    private Long id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章封面
     */
    private String cover;

    /**
     * 发布时间
     */
    private LocalDateTime createTime;

}

