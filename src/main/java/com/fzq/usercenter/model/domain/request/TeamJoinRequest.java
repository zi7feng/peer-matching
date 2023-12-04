package com.fzq.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class TeamJoinRequest implements Serializable {

    private static final long serialVersionUID = 1487035836210576235L;
    /**
     * id
     */
    private Long teamId;

    /**
     * password
     */
    private String password;
}
