package com.xiaozhou.weblog.admin.service;

import com.xiaozhou.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.xiaozhou.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.xiaozhou.weblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.xiaozhou.weblog.admin.model.vo.tag.AddTagReqVO;
import com.xiaozhou.weblog.admin.model.vo.tag.DeleteTagReqVO;
import com.xiaozhou.weblog.admin.model.vo.tag.FindTagPageListReqVO;
import com.xiaozhou.weblog.admin.model.vo.tag.SearchTagReqVO;
import com.xiaozhou.weblog.common.utils.PageResponse;
import com.xiaozhou.weblog.common.utils.Response;

/**
 * @author 小周
 * @date 2025/4/9 13:19
 * @description:
 */
public interface AdminTagService {
    /**
     * 添加标签集合
     * @param addTagReqVO
     * @return
     */
    Response addTag(AddTagReqVO addTagReqVO);


    /**
     * 查询标签分页
     * @param findTagPageListReqVO
     * @return
     */
    PageResponse findTagPageList(FindTagPageListReqVO findTagPageListReqVO);


    /**
     * 查询标签分页
     * @param deleteTagReqVO
     * @return
     */
    Response deleteTag(DeleteTagReqVO deleteTagReqVO);

    /**
     *根据标签关键词模糊查询
     * @param searchTagReqVO
     * @return
     */

    Response cearchTag(SearchTagReqVO searchTagReqVO);
}

