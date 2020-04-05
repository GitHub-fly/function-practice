package com.soft1851.fifth.group.music.service.impl;

import com.soft1851.fifth.group.music.domain.entity.Like;
import com.soft1851.fifth.group.music.domain.vo.MusicVo;
import com.soft1851.fifth.group.music.mapper.MusicMapper;
import com.soft1851.fifth.group.music.service.MusicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    @Resource
    private MusicMapper musicMapper;

    @Override
    public int batchCancel(List<Like> likes) {
        return musicMapper.batchCancel(likes);
    }

    @Override
    public List<MusicVo> selectMusicInfo(Like like) {
        return musicMapper.selectMusicInfo(like);
    }
}
