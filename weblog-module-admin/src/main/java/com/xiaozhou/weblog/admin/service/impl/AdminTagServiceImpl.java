package com.xiaozhou.weblog.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaozhou.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.xiaozhou.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.xiaozhou.weblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.xiaozhou.weblog.admin.model.vo.category.FindCategoryPageListRspVO;
import com.xiaozhou.weblog.admin.model.vo.tag.*;
import com.xiaozhou.weblog.admin.service.AdminCategoryService;
import com.xiaozhou.weblog.admin.service.AdminTagService;
import com.xiaozhou.weblog.common.domain.dos.CategoryDO;
import com.xiaozhou.weblog.common.domain.dos.TagDO;
import com.xiaozhou.weblog.common.domain.mapper.CategoryMapper;
import com.xiaozhou.weblog.common.domain.mapper.TagMapper;
import com.xiaozhou.weblog.common.enums.ResponseCodeEnum;
import com.xiaozhou.weblog.common.exception.BizException;
import com.xiaozhou.weblog.common.model.vo.SelectRspVO;
import com.xiaozhou.weblog.common.utils.PageResponse;
import com.xiaozhou.weblog.common.utils.Response;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author 小周
 * @date 2025/4/9 13:19
 * @description:
 */
@Service
@Slf4j
public class AdminTagServiceImpl extends ServiceImpl<TagMapper, TagDO> implements AdminTagService {

    @Autowired
    private TagMapper tagMapper;


    @Override
    public Response addTag(AddTagReqVO addTagReqVO) {
        //vo转do
        List<TagDO> tagDOS = addTagReqVO.getTags()
                .stream().map(tagName -> TagDO.builder()
                        .name(tagName.trim())  //去掉前后空格
                        .createTime(LocalDateTime.now())
                        .updateTime(LocalDateTime.now())
                        .build())
                .collect(Collectors.toList());

        //批量插入
        try {
            saveBatch(tagDOS);
        }catch (Exception e){
            log.error("该标签已存在",e);
        }

        return Response.success();
    }

    @Override
    public PageResponse findTagPageList(FindTagPageListReqVO findTagPageListReqVO) {
        //分页参数、条件参数
        Long current = findTagPageListReqVO.getCurrent();
        Long size = findTagPageListReqVO.getSize();
        String name =  findTagPageListReqVO.getName();
        LocalDate startDate = findTagPageListReqVO.getStartDate();
        LocalDate endDate = findTagPageListReqVO.getEndDate();

        //分页查询
        Page<TagDO> page = tagMapper.selectPageList(current,size,name,startDate,endDate);
        List<TagDO> records = page.getRecords();

        //do 转 vo
        List<FindTagPageListRspVO> vos = null;

        if(!CollectionUtils.isEmpty(records)){
            vos = records.stream().map(tagDO -> FindTagPageListRspVO.builder()
                    .id(tagDO.getId())
                    .name(tagDO.getName())
                    .createTime(tagDO.getCreateTime())
                    .build()).collect(Collectors.toList());
        }

        return PageResponse.success(page,vos);
    }

    @Override
    public Response deleteTag(DeleteTagReqVO deleteTagReqVO) {
        //标签 id
        Long tagId = deleteTagReqVO.getId();

        //按标签id删除
        int count = tagMapper.deleteById(tagId);
        return count == 1 ? Response.success() : Response.fail(ResponseCodeEnum.TAG_NOT_EXISTED);
    }

    @Override
    public Response cearchTag(SearchTagReqVO searchTagReqVO) {
        String key = searchTagReqVO.getKey();

        // 执行模糊查询
        List<TagDO> tagDOS = tagMapper.selectByKey(key);

        //do转vo
        List<SelectRspVO> vos = null;
        if(!CollectionUtils.isEmpty(tagDOS)){
            vos = tagDOS.stream()
                    .map(tagDO -> SelectRspVO.builder()
                            .label(tagDO.getName())
                            .value(tagDO.getId())
                            .build())
                    .collect(Collectors.toList());
        }
        return Response.success(vos);
    }
}

