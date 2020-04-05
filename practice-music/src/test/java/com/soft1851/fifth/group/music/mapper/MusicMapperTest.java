package com.soft1851.fifth.group.music.mapper;

import com.soft1851.fifth.group.music.util.MusicUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class MusicMapperTest {
    @Resource
    private MusicMapper musicMapper;

    /**
     * 批量插入数据
     * */
    @Test
    public void batchInsert() {
        int[] ints = musicMapper.batchInsert(MusicUtil.musicSpider());
        assertEquals(MusicUtil.musicSpider().size(), ints.length);
    }

    /**
     * 数据库表截断
     * */
    @Test
    public void truncate() {
        musicMapper.truncate();
    }
}
