package com.soft1851.fifth.group.music.mapper;

import com.soft1851.fifth.group.music.domain.entity.Like;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class MusicMapperTest {
    @Resource
    private MusicMapper musicMapper;

    @Test
    public void batchCancel() {
        List<Like> likes = new ArrayList<>(10);
        for (int i = 0; i < 8; i++) {
            likes.add(Like.builder().userId(1).musicId(i).build());
        }
        System.out.println(musicMapper.batchCancel(likes));
    }

    @Test
    public void selectMusicInfo() {
        Like like = Like.builder().userId(1).build();
        musicMapper.selectMusicInfo(like).forEach(System.out::println);
    }
}