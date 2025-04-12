package com.xiaozhou.weblog.admin.convert;

import com.xiaozhou.weblog.admin.model.vo.blogsettings.FindBlogSettingsRspVO;
import com.xiaozhou.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.xiaozhou.weblog.common.domain.dos.BlogSettingsDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author 小周
 * @date 2025/4/12 16:43
 * @description:
 */
@Mapper
public interface BlogSettingsConvert {
    /**
     * 初始化 convert 实例
     */
    BlogSettingsConvert INSTANCE = Mappers.getMapper(BlogSettingsConvert.class);

    /**
     * 将 VO 转化为 DO
     * @param bean
     * @return
     */
    BlogSettingsDO convertVO2DO(UpdateBlogSettingsReqVO bean);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindBlogSettingsRspVO convertDO2VO(BlogSettingsDO bean);

}

