package org.example.util;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * 项目名称：cupid
 * 类 名 称：DateUtil
 * 类 描 述：TODO
 * 创建时间：2022/11/18 16:55
 * 创 建 人：panyong
 */
public class DateUtil {

    public static Long LocalDateTimeToMilli(LocalDateTime time){
        return time.toInstant(ZoneOffset.of("+8")).toEpochMilli();
    }
}
