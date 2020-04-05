package com.soft1851.fifth.group.music.service;

import com.soft1851.fifth.group.music.domain.dto.UserDto;
import com.soft1851.fifth.group.music.domain.entity.User;
import com.soft1851.fifth.group.music.domain.vo.UserVo;

/**
 * @author xunmi
 * @ClassName UserService
 * @Description TODO
 * @Date 2020/4/3
 * @Version 1.0
 **/
public interface UserService {

    /**
     * 用户登录的方法
     * @return
     */
    User login(UserDto userDto);
}
