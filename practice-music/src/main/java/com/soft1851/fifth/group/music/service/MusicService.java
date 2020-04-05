package com.soft1851.fifth.group.music.service;

import com.soft1851.fifth.group.music.domain.entity.Like;
import com.soft1851.fifth.group.music.domain.vo.MusicVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MusicService {
    /**
     * 批量取消收藏歌曲
     * @param likes
     * @return int
     */
    int batchCancel(@Param("likes") List<Like> likes);

    /**
     * 通过收藏表中的音乐id来查看歌曲详情和该首歌曲被收藏的用户的基本信息
     * @param like
     * @return MusicVo
     */
    List<MusicVo> selectMusicInfo(Like like);

}
