package com.xiaozhou.weblog.admin.controller;

import com.xiaozhou.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.xiaozhou.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.xiaozhou.weblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.xiaozhou.weblog.admin.model.vo.tag.AddTagReqVO;
import com.xiaozhou.weblog.admin.model.vo.tag.DeleteTagReqVO;
import com.xiaozhou.weblog.admin.model.vo.tag.FindTagPageListReqVO;
import com.xiaozhou.weblog.admin.model.vo.tag.SearchTagReqVO;
import com.xiaozhou.weblog.admin.service.AdminCategoryService;
import com.xiaozhou.weblog.admin.service.AdminTagService;
import com.xiaozhou.weblog.common.aspect.ApiOperationLog;
import com.xiaozhou.weblog.common.utils.PageResponse;
import com.xiaozhou.weblog.common.utils.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小周
 * @date 2025/4/9 13:20
 * @description: 标签
 */
@RestController
@RequestMapping("/admin")
@Api(tags = "Admin 标签模块")
public class AdminTagController {

    @Autowired
    private AdminTagService tagService;

    @PostMapping("/tag/add")
    @ApiOperation(value = "添加标签")
    @ApiOperationLog(description = "添加标签")
    public Response addTag(@RequestBody @Validated AddTagReqVO addTagReqVO) {
        return tagService.addTag(addTagReqVO);
    }

    @PostMapping("/tag/list")
    @ApiOperation(value = "标签分页数据获取")
    @ApiOperationLog(description = "标签分页数据获取")
    public PageResponse findTagPageList(@RequestBody @Validated FindTagPageListReqVO findTagPageListReqVO) {
        return tagService.findTagPageList(findTagPageListReqVO);
    }

    @PostMapping("/tag/delete")
    @ApiOperation(value = "删除标签")
    @ApiOperationLog(description = "删除标签")
    public Response deleteTag(@RequestBody @Validated DeleteTagReqVO deleteTagReqVO) {
        return tagService.deleteTag(deleteTagReqVO);
    }

    @PostMapping("/tag/cearch")
    @ApiOperation(value = "标签模糊查询")
    @ApiOperationLog(description = "标签模糊查询")
    public Response cearchTag(@RequestBody @Validated SearchTagReqVO searchTagReqVO) {
        return tagService.cearchTag(searchTagReqVO);
    }

//    @PostMapping("/category/select/list")
//    @ApiOperation(value = "分类 Select 下拉列表数据获取")
//    @ApiOperationLog(description = "分类 Select 下拉列表数据获取")
//    public Response findCategorySelectList() {
//        return categoryService.findCategorySelectList();
//    }


}
