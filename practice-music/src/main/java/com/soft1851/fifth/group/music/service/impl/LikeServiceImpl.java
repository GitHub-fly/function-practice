package com.soft1851.fifth.group.music.service.impl;

import com.soft1851.fifth.group.music.domain.entity.Like;
import com.soft1851.fifth.group.music.mapper.LikeMapper;
import com.soft1851.fifth.group.music.service.LikeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author xuyuan
 * @Date 2020/4/4 16:53
 * @Version 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class LikeServiceImpl implements LikeService {
    @Resource
    private LikeMapper likeMapper;

    @Override
    public void insert(Like like) {
        Like like1 = likeMapper.searchMusic(like);
        if(like1 == null){
            likeMapper.insert(like);
        }
    }

    @Override
    public Like searchMusic(Like like) {
        return likeMapper.searchMusic(like);
    }
}
