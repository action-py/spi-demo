package org.example.util;


import org.springframework.util.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 项目名称：cupid
 * 类 名 称：Md5Util
 * 类 描 述：TODO
 * 创建时间：2022/11/30 19:25
 * 创 建 人：panyong
 */
public class Md5Util {

    public static String generateSecretKey(String data){
        String secretKey = "";
        try {
            secretKey = DigestUtils.md5DigestAsHex(data.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return secretKey;
    }
    public static String generateSecretKey(String ... objs){
        String secretKey = "";
        String data = Arrays.asList(objs).stream().sorted().collect(Collectors.joining(":"));
        try {
            secretKey = DigestUtils.md5DigestAsHex(data.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return secretKey;
    }

    public static void main(String[] args) {
        String s = Md5Util.generateSecretKey("75","1569279817067794433-1569279817067794434-1569279817067794435-1569279817067794436-1569279817067794437-1569279817067794438-1569279817067794439-1569279817067794440-1569279817071988736-1569279817071988737-1569279817071988738-1569279817071988739-1569279817071988740");
        System.err.println(s);

    }
}
