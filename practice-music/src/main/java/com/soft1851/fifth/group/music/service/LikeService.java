package com.soft1851.fifth.group.music.service;

import com.soft1851.fifth.group.music.domain.entity.Like;

/**
 * @Author xuyuan
 * @Date 2020/4/4 16:52
 * @Version 1.0
 */
public interface LikeService {
    /**
     *新增收藏用户
     * @param like
     */
    void insert(Like like);
    /**
     *查找用户收藏的数据
     * */
    Like searchMusic(Like like);
}
