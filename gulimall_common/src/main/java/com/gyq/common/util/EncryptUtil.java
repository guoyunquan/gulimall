package com.gyq.common.util;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;


/**
 * @author GYQ
 * @date 2023/6/8 10:57
 * 加密解密工具类
 */

public class EncryptUtil {
    /**
     * 加密
     *
     * @param text 需要加密的字符串
     * @param salt 加密的key（盐）
     * @return 返回加密后的字符串
     */
    public static String encryption(String text, String salt) {
        //key的长度要求16位字母或英文符号
        if (salt.length() != 16) {
            return "key的长度要求16位字母或英文符号";
        }
        byte[] key = salt.getBytes();
        AES aes = SecureUtil.aes(key);
        // 加密为16进制表示
        return aes.encryptHex(text);

    }


    /**
     * 解密
     *
     * @param cipher 需要解密的字符串
     * @param salt   加密的key（盐）
     * @return 返回解密后的字符串
     */
    public static String decode(String cipher, String salt) {
        //key的长度要求16位字母或英文符号
        if (salt.length() != 16) {
            return "key的长度要求16位字母或英文符号";
        }
        byte[] key = salt.getBytes();
        AES aes = SecureUtil.aes(key);
        return aes.decryptStr(cipher, CharsetUtil.CHARSET_UTF_8);

    }

}
