package com.soft1851.fifth.group.music.service;

import com.soft1851.fifth.group.music.domain.dto.UserDto;
import com.soft1851.fifth.group.music.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void login() {
        UserDto userDto = UserDto.builder()
                .email("1")
                .password("1")
                .build();
        System.out.println(userService.login(userDto));
    }
}