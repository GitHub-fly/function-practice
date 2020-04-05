package com.soft1851.fifth.group.music.mapper;

import com.soft1851.fifth.group.music.domain.dto.UserDto;
import com.soft1851.fifth.group.music.domain.entity.User;
import com.soft1851.fifth.group.music.util.Md5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void selectByDynamicSql() {
        User user1 = new User();
        user1.setPhoneNumber("1");
        User user2 = new User();
        user2.setEmail("1");
        User userList1 = userMapper.selectByDynamicSql(user1);
        // userList1.getCreateTime();
        User userList2 = userMapper.selectByDynamicSql(user2);
        System.out.println(userList1);
    }

    @Test
    public void selectUserInfo() {
        User user = User.builder().id(1).build();
        userMapper.selectUserInfo(user).forEach(System.out::println);
    }

    @Test
    public void update() {
        User user = User.builder()
                .id(1)
                .credits(5)
                .build();
        userMapper.update(user);
    }

    @Test
    public void insert() {
        String salt = Md5Util.salt();
        System.out.println(salt);
        User user = User.builder()
                .phoneNumber("123123")
                .salt(salt)
                .password(Md5Util.md5WithSalt("123", salt))
                .createTime(LocalDateTime.now())
                .lastLoginTime(LocalDateTime.now())
                .build();
        userMapper.insert(user);
    }

    @Test
    public void getSaltById() {
        UserDto userDto = UserDto.builder()
                .phoneNumber("123123").build();
        System.out.println(userMapper.getSaltById(userDto));
    }
}