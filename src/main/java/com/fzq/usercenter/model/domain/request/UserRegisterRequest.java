package com.fzq.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * User register body
 *
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * user account
     */
    private String userAccount;

    /**
     * password
     */
    private String userPassword;

    /**
     * check password
     */
    private String checkPassword;

    /**
     * invite code
     */
    private String inviteCode;
}
