package com.soft1851.fifth.group.music.service;

import com.soft1851.fifth.group.music.domain.entity.Like;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class MusicServiceTest {
    @Resource
    private MusicService musicService;

    @Test
    public void batchCancel() {
        List<Like> likeList = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            likeList.add(Like.builder().userId(1).musicId(i).build());
        }
        musicService.batchCancel(likeList);
    }

    @Test
    public void selectMusicInfo() {
        Like like = Like.builder().musicId(20).build();
        musicService.selectMusicInfo(like).forEach(System.out::println);
    }
}