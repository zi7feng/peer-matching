package com.fzq.usercenter.utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Test for algo utils
 */
public class AlgorithmUtilsTest {

    @Test
    void test() {
        String str1 = "This is an apple.";
        String str2 = "This is not an apple.";
        String str3 = "This is a banana, not an apple.";
        // 1
        int score1 = AlgorithmUtils.minDistance(str1, str2);
        // 3
        int score2 = AlgorithmUtils.minDistance(str1, str3);
        System.out.println(score1);
        System.out.println(score2);
    }

    @Test
    void testCompareTags() {
        List<String> tagList1 = Arrays.asList("Java", "Graduate", "Male");
        List<String> tagList2 = Arrays.asList("Java", "Graduate", "Female");
        List<String> tagList3 = Arrays.asList("Python", "UnderGraduate", "Female");
        // 4
        int score1 = AlgorithmUtils.minDistance(tagList1, tagList2);
        // 14
        int score2 = AlgorithmUtils.minDistance(tagList1, tagList3);
        System.out.println(score1);
        System.out.println(score2);
    }
}