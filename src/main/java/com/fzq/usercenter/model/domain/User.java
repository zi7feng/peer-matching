package com.fzq.usercenter.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体
 *
 */
@TableName(value = "user")
@Data
public class User implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * user name
     */
    private String username;

    /**
     * user account
     */
    private String userAccount;

    /**
     * avatarUrl
     */
    private String avatarUrl;

    /**
     * profile
     */
    private String profile;

    /**
     * gender
     */
//    private Integer gender;
    private String gender;
    /**
     * password
     */
    private String userPassword;

    /**
     * phone
     */
    private String phone;

    /**
     * email
     */
    private String email;

    /**
     * status: 0 - normal
     */
    private Integer userStatus;

    /**
     * create time
     */
    private Date createTime;

    /**
     *
     */
    private Date updateTime;

    /**
     * isDelete
     */
    @TableLogic
    private Integer isDelete;

    /**
     * role: 0 - common user, 1 - administrator
     */
    private Integer userRole;

    /**
     * invitecode
     */
    private String inviteCode;

    private String tags;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}

