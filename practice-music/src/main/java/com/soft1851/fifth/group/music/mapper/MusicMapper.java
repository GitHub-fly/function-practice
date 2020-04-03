package com.soft1851.fifth.group.music.mapper;

import com.soft1851.fifth.group.music.domain.entity.Like;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xunmi
 * @ClassName MusicMapper
 * @Description TODO
 * @Date 2020/4/3
 * @Version 1.0
 **/
@Transactional(rollbackFor = Exception.class)
public interface MusicMapper {

    /**
     * 批量取消收藏歌曲
     * @param likes
     * @return int
     */
    int batchCancel(@Param("likes") List<Like> likes);


}
