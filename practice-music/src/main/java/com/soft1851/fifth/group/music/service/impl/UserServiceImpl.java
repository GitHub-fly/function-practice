package com.soft1851.fifth.group.music.service.impl;

import com.soft1851.fifth.group.music.domain.dto.UserDto;
import com.soft1851.fifth.group.music.domain.entity.User;
import com.soft1851.fifth.group.music.domain.vo.UserVo;
import com.soft1851.fifth.group.music.mapper.UserMapper;
import com.soft1851.fifth.group.music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xunmi
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Date 2020/4/3
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(UserDto userDto) {
        User user = User.builder()
                .email(userDto.getEmail())
                .phoneNumber(userDto.getPhoneNumber())
                .password(userDto.getPassword())
                .build();
        return userMapper.selectByDynamicSql(user);
    }
}
