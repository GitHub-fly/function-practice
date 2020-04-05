package com.soft1851.fifth.group.music.service.impl;

import com.soft1851.fifth.group.music.domain.dto.UserDto;
import com.soft1851.fifth.group.music.domain.entity.User;
import com.soft1851.fifth.group.music.mapper.UserMapper;
import com.soft1851.fifth.group.music.service.UserService;
import com.soft1851.fifth.group.music.util.Md5Util;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * @author xunmi
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Date 2020/4/3
 * @Version 1.0
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(UserDto userDto) {
        String salt = userMapper.getSaltById(userDto);
        User user = User.builder()
                .email(userDto.getEmail())
                .phoneNumber(userDto.getPhoneNumber())
                .password(Md5Util.md5WithSalt(userDto.getPassword(), "140251C7A15D0135"))
                .build();
        return userMapper.selectByDynamicSql(user);
    }

    @Override
    public void update(User user) {
        // 获取当前时间
        LocalDateTime current = LocalDateTime.now();
        LocalDate currentLocalDate = current.toLocalDate();

        LocalDate priorTo = user.getLastLoginTime().toLocalDate();

        // 输出 判断 priorTo 是不是 currentLocalDate 的前一天
        System.out.println(priorTo.isBefore(currentLocalDate));

        if (priorTo.isBefore(currentLocalDate)) {
            user.setCredits(user.getCredits() + 5);
            userMapper.update(user);
        }
    }
}
