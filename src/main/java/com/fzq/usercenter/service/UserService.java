package com.fzq.usercenter.service;

import com.fzq.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * user service
 */
public interface UserService extends IService<User> {

    /**
     * register
     *
     * @param userAccount   userAccount
     * @param userPassword  password
     * @param checkPassword check password
     * @param inviteCode    invitecode
     * @return newUser id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String inviteCode);

    /**
     * login
     *
     * @param userAccount  userAccount
     * @param userPassword password
     * @param request
     * @return
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * desensitization
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * logout
     *
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

    /**
     * Search user by tags
     *
     * @param tagNameList
     * @return
     */
    List<User> searchUserByTags(List<String> tagNameList);

    boolean isAdmin(HttpServletRequest request);

    boolean isAdmin(User loginUser);

    User getCurrentUser(HttpServletRequest request);

    int updateUser(User user, User loginUser);

    List<User> matchUsers(long num, User loginUser);
}
