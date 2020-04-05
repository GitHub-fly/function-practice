package com.soft1851.fifth.group.music.controller;

import com.alibaba.fastjson.JSON;
import com.soft1851.fifth.group.music.domain.entity.User;
import com.soft1851.fifth.group.music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author xunmi
 * @ClassName UserController
 * @Description TODO
 * @Date 2020/4/5
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "user", produces = "application/json; charset=UTF-8")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/login")
    public User login() {
        return null;
    }

}
