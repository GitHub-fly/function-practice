package com.soft1851.fifth.group.music.mapper;

import com.soft1851.fifth.group.music.domain.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

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
}