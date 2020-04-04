package com.soft1851.fifth.group.music.mapper;

import com.soft1851.fifth.group.music.domain.entity.Like;
import com.soft1851.fifth.group.music.domain.entity.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author xuyuan
 * @Date 2020/4/4 16:38
 * @Version 1.0
 */
@Transactional(rollbackFor = Exception.class)
public interface LikeMapper {
    /**
     *新增收藏用户
     * @param like
     */
    void insert(Like like);

    /**
     * 根据id删除
     * @param id
     */
    void delete(int id);
}
