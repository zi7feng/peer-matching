package com.fzq.usercenter.once;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class UserInfo {

    @ExcelProperty("inviteCode")
    private String inviteCode;

    @ExcelProperty("userName")
    private String userName;

}