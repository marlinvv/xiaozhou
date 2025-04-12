package com.xiaozhou.weblog.admin.service;

import com.xiaozhou.weblog.common.utils.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 小周
 * @date 2025/4/12 10:56
 * @description:
 */
public interface AdminFileService {
    /**
     * 上传文件
     * @param file
     * @return
     */
    Response uploadFile(MultipartFile file);
}

