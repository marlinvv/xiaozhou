package com.xiaozhou.weblog.web.model;

import lombok.Data;
import javax.validation.constraints.*;

/**
 * @author 小周
 * @date 2025/4/1 19:40
 * @description: TODO
 */
@Data
public class User {
    //用户名
    @NotBlank(message = "用户名不能为空") //注解确保用户名不能为空
    private String username;
    //性别
    @NotNull(message = "性别不能为空") //注解确保性别不能为空
    private Integer sex;

    //年龄
    @NotNull(message = "年龄不能为空")
    @Min(value = 18,message = "年龄必须大于或等于18") //注解确保年龄大于等于18
    @Max(value = 100,message = "年龄必须大于或等于100")//注解确保年龄小于等于100
    private Integer age;

    //邮箱
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确") //注解确保邮箱格式正确
    private String email;
}
