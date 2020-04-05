package com.soft1851.fifth.group.music.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/**
 * @author xuyuan
 * @ClassName ClazzVo
 * @Description TODO
 * @Date 2020/3/31
 * @Version 1.0
 **/
public class Md5Util {
    private static char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    /**
     * 申明使用MD5算法,更改参数为"SHA"就是SHA算法了
     */
    private static MessageDigest md;

    static {
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    /**
     * @params: [inputStr] 输入明文
     * @Descrption: 不加盐MD5
     */
    public static String md5WithoutSalt(String inputStr) {
        try {
            // 哈希计算，转换输出
            return byte2HexStr(md.digest(inputStr.getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        }
    }

    /**
     * MD5加盐，盐的获取分两种情况;输入明文加盐；输出密文带盐(将salt存储到hash值中)
     *
     * @param inputStr 是输入的明文
     * @param salt      是处理类型，"0" 表示注册存 hash 值到库时，其它值表示登录的时候传递的 salt 值
     * @return 密文
     */
    public static String md5WithSalt(String inputStr, String salt) {
        try {
            // 申明使用 MD5 算法，更改参数为"SHA"就是 SHA 算法了
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 加盐，输入加盐
            String inputWithSalt = inputStr + salt;
            // 哈希计算,转换输出
            String hashResult = byte2HexStr(md.digest(inputWithSalt.getBytes()));
            System.out.println("加盐密文：" + hashResult);
            return hashResult;
        } catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        }
    }

    /**
     * @return: salt
     * @params:
     * @Descrption: 自定义简单生成盐，是一个随机生成的长度为16的字符串，每一个字符是随机的十六进制字符
     */
    public static String salt() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(16);
        for (int i = 0; i < sb.capacity(); i++) {
            sb.append(hex[random.nextInt(16)]);
        }
        return sb.toString();
    }

    /**
     * @return: 十六进制字符串
     * @params: [bytes]
     * @Descrption: 将字节数组转换成十六进制字符串
     */
    private static String byte2HexStr(byte[] bytes) {
        int len = bytes.length;
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < len; i++) {
            byte byte0 = bytes[i];
            result.append(hex[byte0 >>> 4 & 0xf]);
            result.append(hex[byte0 & 0xf]);
        }
        return result.toString();
    }

    /**
     * 从库中查找到的 hash 值提取出的salt
     *
     * @param hash 3i byte带盐的hash值,带盐方法与MD5WithSalt中相同
     * @return 提取的salt
     */
    public static String getSaltFromHash(String hash) {
        StringBuilder sb = new StringBuilder();
        char[] h = hash.toCharArray();
        for (int i = 0; i < hash.length(); i += 3) {
            sb.append(h[i + 1]);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        String input = "123456";
        System.out.println("MD5加密" + "\n"
                + "明文：" + input + "\n"
                + "无盐密文：" + md5WithoutSalt(input));
        System.out.println("带盐密文：" + md5WithSalt(input, "0"));
    }

}
