package com.soft1851.fifth.group.music.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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

    private Integer userId;
    private String name;
    private String email;
    private String phoneNumber;
    /**
     * 用户积分
     */
    private Integer credits;
}
