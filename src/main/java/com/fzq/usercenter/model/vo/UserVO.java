package com.fzq.usercenter.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * Encapsulation of User info
 */

@Data
public class UserVO implements Serializable {

    /**
     * id
     */
    private long id;

    /**
     * UserName
     */
    private String userName;

    /**
     * user account
     */
    private String userAccount;

    /**
     * avatarUrl
     */
    private String avatarUrl;

    /**
     * gender
     */
    private Integer gender;

    /**
     * phone
     */
    private String phone;

    /**
     * email
     */
    private String email;

    /**
     * tagList, json
     */
    private String tags;

    /**
     * status 0 - normal
     */
    private Integer userStatus;

    /**
     * Create Time
     */
    private Date createTime;

    /**
     *  update time
     */
    private Date updateTime;

    /**
     * userRole 0 - User 1 - Admin
     */
    private Integer userRole;

    /**
     * inviteCode
     */
    private String inviteCode;

    private static final long serialVersionUID = 1L;

}
