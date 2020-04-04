package com.soft1851.fifth.group.music.domain.vo;

import com.soft1851.fifth.group.music.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author xunmi
 * @ClassName MusicVo
 * @Description TODO
 * @Date 2020/4/3
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MusicVo {
    private Integer musicId;
    private String title;
    private String url;
    private String singer;
    private String cover;
    /**
     * 只包含用户的一些基本信息
     */
    private List<User> users;
}
