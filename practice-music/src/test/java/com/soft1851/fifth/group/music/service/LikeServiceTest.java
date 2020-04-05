package com.soft1851.fifth.group.music.service;

import com.soft1851.fifth.group.music.domain.entity.Like;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class LikeServiceTest {
@Resource
private LikeService likeService;
    @Test
    public void insert() {
        Like like = Like.builder().musicId(5).userId(5).build();
        likeService.insert(like);
    }

    @Test
    public void searchMusic() {
        Like like = Like.builder().musicId(5).userId(5).build();
        System.out.println(likeService.searchMusic(like));
    }
}