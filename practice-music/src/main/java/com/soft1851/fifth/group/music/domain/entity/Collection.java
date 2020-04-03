package com.soft1851.fifth.group.music.domain.entity;

import lombok.*;

/**
 * @author xunmi
 * @ClassName Teacher
 * @Description TODO
 * @Date 2020/3/31
 * @Version 1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Collection {
    private Integer id;
    private Integer musicId;
    private Integer userId;
}
