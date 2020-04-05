package com.soft1851.fifth.group.music.service;

import com.soft1851.fifth.group.music.domain.entity.User;
import com.soft1851.fifth.group.music.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Resource
    private UserMapper userMapper;

    @Test
    public void update() {
        User user = new User();
        user.setLastLoginTime(
                LocalDateTime.of(2020, 4, 4, 18, 30, 10));
        user.setId(1);
        user.setCredits(5);
        userService.update(user);
    }
}