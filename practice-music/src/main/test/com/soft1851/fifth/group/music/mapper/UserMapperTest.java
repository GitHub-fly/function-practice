package com.soft1851.fifth.group.music.mapper;

import com.soft1851.fifth.group.music.domain.entity.User;
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
    public void insert() {
        User user = User.builder().salt("1235").email("351234359@qq.com").createTime(LocalDateTime.now()).lastLoginTime(LocalDateTime.now()).build();
        userMapper.insert(user);
        User user1 = User.builder().salt("1235").phoneNumber("18094246920").createTime(LocalDateTime.now()).lastLoginTime(LocalDateTime.now()).build();
        userMapper.insert(user1);
    }
}