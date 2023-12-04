package com.fzq.usercenter.service;

import com.fzq.usercenter.model.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@SpringBootTest
public class InsertUsersTest {
    @Resource
    private UserService userService;

    // thread config
    private ExecutorService executorService = new ThreadPoolExecutor(16, 1000, 10000, TimeUnit.MINUTES, new ArrayBlockingQueue<>(10000));


//    @Test
//    public void doInsertUser() {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        final int INSERT_NUM = 1000;
//        List<User> userList = new ArrayList<>();
//        for (int i = 0; i < INSERT_NUM; i++) {
//            User user = new User();
//            user.setUsername("mockUser");
//            user.setUserAccount("fakeaccount");
//            user.setAvatarUrl("https://rustacean.net/assets/rustacean-flat-happy.svg");
//            user.setGender("Male");
//            user.setUserPassword("231313123");
//            user.setPhone("1231312");
//            user.setEmail("12331234@gmail.com");
//            user.setUserStatus(0);
//            user.setUserRole(0);
//            user.setInviteCode("21313");
//            user.setTags("[]");
//            userList.add(user);
//        }
//        userService.saveBatch(userList, 100);
//        stopWatch.stop();
//        System.out.println(stopWatch.getLastTaskTimeMillis());
//
//    }
//
//    @Test
//    public void doConcurrencyInsertUser() {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        final int INSERT_NUM = 10000000;
//        int j = 0;
//        int batchSize = 50000;
//        List<CompletableFuture<Void>> futureList = new ArrayList<>();
//        for (int i = 0; i < INSERT_NUM / batchSize; i++) {
//            List<User> userList = new ArrayList<>();
//            while (true) {
//                j++;
//                User user = new User();
//                user.setUsername("mockUser");
//                user.setUserAccount("mock");
//                user.setAvatarUrl("https://rustacean.net/assets/rustacean-flat-happy.svg");
//                user.setProfile("fat cat");
//                user.setGender("Male");
//                user.setUserPassword("12345678");
//                user.setPhone("123456789108");
//                user.setEmail("22288999@gmail.com");
//                user.setUserStatus(0);
//                user.setUserRole(0);
//                user.setInviteCode("33322");
//                user.setTags("[]");
//                userList.add(user);
//                if (j % batchSize == 0) {
//                    break;
//                }
//            }
//            // async task
//            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
//                System.out.println("ThreadName：" + Thread.currentThread().getName());
//                userService.saveBatch(userList, batchSize);
//            }, executorService);
//            futureList.add(future);
//        }
//        CompletableFuture.allOf(futureList.toArray(new CompletableFuture[]{})).join();
//
//        stopWatch.stop();
//        System.out.println(stopWatch.getLastTaskTimeMillis());
//    }
}