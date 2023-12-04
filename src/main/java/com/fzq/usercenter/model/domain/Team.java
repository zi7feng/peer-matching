package com.fzq.usercenter.model.domain;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Team
 * @TableName team
 */
@TableName(value ="team")
@Data
public class Team implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * Team name
     */
    private String name;

    /**
     * description
     */
    private String description;

    /**
     * maximum member number
     */
    private Integer maxNum;

    /**
     * expire time
     */
    private Date expireTime;

    /**
     * userId（Holder id）
     */
    private Long userId;

    /**
     * 0 - public，1 - private，2 - encrypted
     */
    private Integer status;

    /**
     * Team password
     */
    private String password;

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