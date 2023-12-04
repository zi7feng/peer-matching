package com.fzq.usercenter.model.domain.request;

import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TeamAddRequest implements Serializable {

    private static final long serialVersionUID = 2582077258442632188L;
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


}
