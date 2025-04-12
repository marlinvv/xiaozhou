package com.xiaozhou.weblog.admin.service;

import com.xiaozhou.weblog.admin.model.vo.user.UpdateAdminUserPasswordReqVO;
import com.xiaozhou.weblog.common.utils.Response;

/**
 * @author 小周
 * @date 2025/4/8 10:41
 * @description:
 */
public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);

    /**
     * 获取当前登录用户信息
     * @return
     */
    Response findUserInfo();
}

