package com.soft1851.fifth.group.music.mapper;

import com.soft1851.fifth.group.music.domain.entity.Like;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;



/**
 * @Author xuyuan
 * @Date 2020/4/5 0:19
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class LikeMapperTest {
    @Resource
    private LikeMapper likeMapper;
    @Test
    public void insert(){
        Like like=new Like();
        like.setMusicId(5);
        like.setUserId(5);
        likeMapper.insert(like);
    }

    @Test
    public void delete() {
        likeMapper.delete(3);
    }
}