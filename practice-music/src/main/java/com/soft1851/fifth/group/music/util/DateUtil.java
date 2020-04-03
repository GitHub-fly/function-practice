package com.soft1851.fifth.group.music.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author xunmi
 * @ClassName DataUtil
 * @Description TODO
 * @Date 2020/4/3
 * @Version 1.0
 **/
public class DateUtil {

    /**
     * 获取当前时间的方法
     * @return 返回 “2020-04-03 20:36:00” 类型
     */
    public static String getDate() {
        LocalDateTime now = LocalDateTime.now();
        // 格式化模板
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }


    public static void main(String[] args) {
        System.out.println(getDate());
    }
}
