package com.fzq.usercenter.service;

import com.fzq.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootTest
public class RedisTest {
    @Resource
    private RedisTemplate redisTemplate;

//    @Test
//    void test() {
//        ValueOperations valueOperations = redisTemplate.opsForValue();
//        valueOperations.set("fzqString", "fish");
//        valueOperations.set("fzqInt", 2);
//        valueOperations.set("fzqDouble", 1.5);
//        User user = new User();
//        user.setId(1L);
//        user.setUsername("fzq");
//        valueOperations.set("fzqUser", user);
//
//        // query
//        Object zq = valueOperations.get("fzqString");
//        Assertions.assertTrue("fish".equals((String) zq));
//        zq = valueOperations.get("fzqInt");
//        Assertions.assertTrue(2 == (Integer) zq);
//        zq = valueOperations.get("fzqDouble");
//        Assertions.assertTrue(1.5 == (Double) zq);
//
//        System.out.println(valueOperations.get("fzqUser"));
//
//    }
}
