package com.fzq.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fzq.usercenter.model.domain.Team;
import com.fzq.usercenter.model.domain.User;
import com.fzq.usercenter.model.domain.dto.TeamQuery;
import com.fzq.usercenter.model.domain.request.TeamJoinRequest;
import com.fzq.usercenter.model.domain.request.TeamQuitRequest;
import com.fzq.usercenter.model.domain.request.TeamUpdateRequest;
import com.fzq.usercenter.model.vo.TeamUserVO;

import java.util.List;


public interface TeamService extends IService<Team> {

    /**
     * Create team
     * @param team
     * @param loginUser
     * @return teamId
     */
    long addTeam(Team team, User loginUser);

    /**
     * list teams
     * @param teamQuery
     * @param isAdmin
     * @return List<TeamUserVO>
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * update team
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);


    /**
     * Join team
     * @param teamJoinRequest
     * @param loginUser
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * quit team
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    /**
     * delete User
     * @param id
     * @param loginUser
     * @return
     */
    boolean deleteTeam(long id, User loginUser);


}
