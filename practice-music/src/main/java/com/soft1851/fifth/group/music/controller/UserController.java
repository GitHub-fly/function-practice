package com.soft1851.fifth.group.music.controller;

import com.alibaba.fastjson.JSON;
import com.soft1851.fifth.group.music.domain.entity.User;
import com.soft1851.fifth.group.music.service.UserService;
import com.soft1851.fifth.group.music.util.ResponseObject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author xunmi
 * @ClassName UserController
 * @Description TODO
 * @Date 2020/4/5
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/user", produces = "application/json; charset=UTF-8")
public class UserController {

    @Resource
    private UserService userService;
    @GetMapping(value = "/login")
    public User login() {
        return null;
    }
    @PostMapping(value ="/register",produces = "application/json; charset=UTF-8")
    public String register(@RequestParam User user){
        ResponseObject ro = new ResponseObject(1,"成功",userService.register(user));
        return  JSON.toJSONString(ro);
    }
}
