package com.fzq.usercenter.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Relationship of Teams and Users
 * @TableName user_team
 */
@TableName(value ="user_team")
@Data
public class UserTeam implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * User id
     */
    private Long userId;

    /**
     * Team id
     */
    private Long teamId;

    /**
     * Join time
     */
    private Date joinTime;

    /**
     * create time
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * is delete?
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}