package com.fzq.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class TeamQuitRequest implements Serializable {

    private static final long serialVersionUID = 8245871734867391926L;
    /**
     * team id
     */
    private Long teamId;
}
