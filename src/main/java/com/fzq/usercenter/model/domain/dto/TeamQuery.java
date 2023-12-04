package com.fzq.usercenter.model.domain.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fzq.usercenter.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

/**
 * Query encapsulation class
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TeamQuery extends PageRequest {

    /**
     * id
     */
    private Long id;

    /**
     * id list
     */
    private List<Long> idList;

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
     * userId（Holder id）
     */
    private Long userId;

    /**
     * 0 - public，1 - private，2 - encrypted
     */
    private Integer status;

    /**
     * keyword of TeamName and Team description
     */
    private String searchText;


}
