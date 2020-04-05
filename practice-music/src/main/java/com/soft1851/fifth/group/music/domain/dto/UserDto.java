package com.soft1851.fifth.group.music.domain.dto;

import lombok.*;

/**
 * @author xunmi
 * @ClassName UserDto
 * @Description TODO
 * @Date 2020/4/5
 * @Version 1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
    private Integer id;
    private String password;
    private String email;
    private String phoneNumber;
}
