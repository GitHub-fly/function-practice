package com.soft1851.fifth.group.music.domain.vo;

import com.soft1851.fifth.group.music.domain.entity.Music;
import lombok.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserVo {
    private Integer userId;
    private String name;
    private String email;
    private String phoneNumber;
    private Integer credits;

    private Integer musicId;
    private String title;
    private String url;
    private String singer;
    private String cover;
}
