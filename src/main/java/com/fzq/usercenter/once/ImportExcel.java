package com.fzq.usercenter.once;


import com.alibaba.excel.EasyExcel;

/**
 * 导入Excel
 */
public class ImportExcel {
    public static void main(String[] args) {
        String fileName = "/Users/zfeng/IdeaProjects/peer-matching/src/main/resources/testExcel.xlsx";

        EasyExcel.read(fileName, UserInfo.class, new TableListener()).sheet().doRead();
    }
}
