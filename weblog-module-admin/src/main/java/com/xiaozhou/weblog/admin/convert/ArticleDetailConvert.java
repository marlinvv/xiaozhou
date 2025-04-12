package com.xiaozhou.weblog.admin.convert;

import com.xiaozhou.weblog.admin.model.vo.article.FindArticleDetailRspVO;
import com.xiaozhou.weblog.common.domain.dos.ArticleDO;
import org.apache.ibatis.annotations.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author 小周
 * @date 2025/4/12 23:08
 * @description:
 */
@Mapper
public interface ArticleDetailConvert {
    /**
     * 初始化 convert 实例
     */
    ArticleDetailConvert INSTANCE = Mappers.getMapper(ArticleDetailConvert.class);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindArticleDetailRspVO convertDO2VO(ArticleDO bean);

}

