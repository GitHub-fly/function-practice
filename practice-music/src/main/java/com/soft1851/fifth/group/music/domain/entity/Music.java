package com.soft1851.fifth.group.music.domain.entity;

import lombok.*;

import java.util.List;

/**
 * @author xunmi
 * @ClassName Clazz
 * @Description TODO
 * @Date 2020/3/31
 * @Version 1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Music {
    private Integer id;
    private String title;
    private String url;
    private String singer;
    private String cover;
}