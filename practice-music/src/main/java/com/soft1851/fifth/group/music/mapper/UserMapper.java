package com.soft1851.fifth.group.music.mapper;

import com.soft1851.fifth.group.music.domain.entity.User;
import org.springframework.transaction.annotation.Transactional;

/*@ClassName UserMapper
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/2
 *@Version 1.0
 **/

@Transactional(rollbackFor = Exception.class)
public interface UserMapper {
    /*
    * 新增用户
    * */
    void insert(User user);
}
