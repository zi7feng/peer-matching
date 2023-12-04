package com.fzq.usercenter.once;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * import to database
 */
public class ImportUser {
    public static void main(String[] args) {

        String fileName = "/Users/zfeng/IdeaProjects/peer-matching/src/main/resources/prodExcel.xlsx";
        List<UserInfo> userInfoList =
                EasyExcel.read(fileName).head(UserInfo.class).sheet().doReadSync();

        System.out.println("total = " + userInfoList.size());
        // check duplicate
        Map<String, List<UserInfo>> listMap =
                userInfoList.stream()
                        .filter(userInfo -> StringUtils.isNotEmpty(userInfo.getUserName()))
                        .collect(Collectors.groupingBy(UserInfo::getUserName));

        for (Map.Entry<String, List<UserInfo>> stringListEntry : listMap.entrySet()) {
            if (stringListEntry.getValue().size() > 1) {
                System.out.println("username = " + stringListEntry.getKey());
                System.out.println("1");
            }
        }
        System.out.println("count of not duplicate = " + listMap.keySet().size());
    }
}
