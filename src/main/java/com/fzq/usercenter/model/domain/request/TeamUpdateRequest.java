package com.fzq.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Team update request body
 *
 */

@Data
public class TeamUpdateRequest implements Serializable {

    private static final long serialVersionUID = -6043915331807008592L;

    /**
     * id
     */
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
     * expire time
     */
    private Date expireTime;

    /**
     * 0 - public，1 - private，2 - encrypted
     */
    private Integer status;

    /**
     * password
     */
    private String password;
}