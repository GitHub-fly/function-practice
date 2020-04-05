package com.soft1851.fifth.group.music.mapper;

import com.soft1851.fifth.group.music.domain.entity.Like;
import com.soft1851.fifth.group.music.domain.entity.Music;
import com.soft1851.fifth.group.music.domain.vo.MusicVo;
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

    /**
     * 通过收藏表中的音乐id来查看歌曲详情和该首歌曲被收藏的用户的基本信息
     * @param like
     * @return MusicVo
     */
    List<MusicVo> selectMusicInfo(Like like);

    /**
     * 批量插入
     * @param musics
     * @return int
     * */
    int[] batchInsert(@Param("music") List<Music> musics);

    /**
     * 截断SQL表
     * @return int
     * */
     void truncate();

}
