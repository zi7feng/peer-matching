package com.fzq.usercenter.service;

import org.junit.jupiter.api.Test;
import org.redisson.api.RList;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class RedissonTest {

    @Resource
    private RedissonClient redissonClient;

    @Test
    void test() {

        // list
        List<String> list = new ArrayList<>();
        list.add("fzq");
        System.out.println("list: " + list.get(0));
//        list.remove(0);

        RList<String> rList = redissonClient.getList("test-list");
        rList.add("fzq");
        System.out.println("rlist: " + list.get(0));
//        rList.remove(0);

    }
}
