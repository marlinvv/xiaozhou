package com.xiaozhou.weblog.admin.service;

import com.xiaozhou.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.xiaozhou.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.xiaozhou.weblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.xiaozhou.weblog.common.utils.PageResponse;
import com.xiaozhou.weblog.common.utils.Response;

/**
 * @author 小周
 * @date 2025/4/9 13:19
 * @description:
 */
public interface AdminCategoryService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response addCategory(AddCategoryReqVO addCategoryReqVO);

    /**
     * 分类分页数据查询
     * @param findCategoryPageListReqVO
     * @return
     */
    PageResponse findCategoryPageList(FindCategoryPageListReqVO findCategoryPageListReqVO);

    /**
     * 删除分类
     * @param deleteCategoryReqVO
     * @return
     */
    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);

    /**
     * 获取文章分类的 Select 列表数据
     * @return
     */
    Response findCategorySelectList();

}

