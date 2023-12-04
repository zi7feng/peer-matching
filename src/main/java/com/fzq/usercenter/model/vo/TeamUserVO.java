package com.fzq.usercenter.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Encapsulation of Team-User info
 */

@Data
public class TeamUserVO implements Serializable {

    private static final long serialVersionUID = 6055449355350256813L;

    /**
     * id
     */
    private Long id;

    /**
     * TeamNam
     */
    private String name;

    /**
     * Description
     */
    private String description;

    /**
     * MaxNum of members in a team
     */
    private Integer maxNum;

    /**
     * expire time
     */
    private Date expireTime;

    /**
     * UserId
     */
    private Long userId;

    /**
     * 0 - Public，1 - private，2 - Encrypted
     */
    private Integer status;

    /**
     * Create Time
     */
    private Date createTime;

    /**
     * Update time
     */
    private Date updateTime;

    /**
     * Info of createUser
     */
    private UserVO createUser;

    /**
     * # of user that has joined
     */
    private Integer hasJoinNum;

    /**
     * has Join?
     */
    private boolean hasJoin = false;

}
