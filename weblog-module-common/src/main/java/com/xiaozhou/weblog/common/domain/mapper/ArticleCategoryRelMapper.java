package com.xiaozhou.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.xiaozhou.weblog.common.domain.dos.ArticleCategoryRelDO;

/**
 * @author 小周
 * @date 2025/4/12 19:22
 * @description:
 */
public interface ArticleCategoryRelMapper extends BaseMapper<ArticleCategoryRelDO> {

    /**
     * 根据文章 ID 删除关联记录
     * @param articleId
     * @return
     */
    default int deleteByArticleId(Long articleId) {
        return delete(Wrappers.<ArticleCategoryRelDO>lambdaQuery()
                .eq(ArticleCategoryRelDO::getArticleId, articleId));
    }

    /**
     * 根据文章 ID 查询
     * @param articleId
     * @return
     */
    default ArticleCategoryRelDO selectByArticleId(Long articleId) {
        return selectOne(Wrappers.<ArticleCategoryRelDO>lambdaQuery()
                .eq(ArticleCategoryRelDO::getArticleId, articleId));
    }
}


