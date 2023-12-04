package com.fzq.usercenter.model.domain.request;


import lombok.Data;

import java.io.Serializable;

/**
 * User login request body
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * User account
     */
    private String userAccount;

    /**
     * password
     */
    private String userPassword;

}
