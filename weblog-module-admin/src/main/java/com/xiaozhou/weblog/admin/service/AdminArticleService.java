package com.xiaozhou.weblog.admin.service;

import com.xiaozhou.weblog.admin.model.vo.article.DeleteArticleReqVO;
import com.xiaozhou.weblog.admin.model.vo.article.FindArticleDetailReqVO;
import com.xiaozhou.weblog.admin.model.vo.article.FindArticlePageListReqVO;
import com.xiaozhou.weblog.admin.model.vo.article.PublishArticleReqVO;
import com.xiaozhou.weblog.common.utils.Response;

/**
 * @author 小周
 * @date 2025/4/12 19:25
 * @description:
 */
public interface AdminArticleService {
    /**
     * 发布文章
     * @param publishArticleReqVO
     * @return
     */
    Response publishArticle(PublishArticleReqVO publishArticleReqVO);

    /**
     * 删除文章
     * @param deleteArticleReqVO
     * @return
     */
    Response deleteArticle(DeleteArticleReqVO deleteArticleReqVO);

    /**
     * 查询文章分页数据
     * @param findArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindArticlePageListReqVO findArticlePageListReqVO);

    /**
     * 查询文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);
}

