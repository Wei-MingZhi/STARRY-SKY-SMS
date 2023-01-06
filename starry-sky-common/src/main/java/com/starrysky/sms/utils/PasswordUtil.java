package com.starrysky.sms.utils;

import org.jasypt.util.text.BasicTextEncryptor;

public class PasswordUtil {

    /**
     * 加密
     * @param password
     * @return
     */
    public static String encryption(String password){
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("password");
        return textEncryptor.encrypt(password);
    }


    /**
     * 解密
     * @param password
     * @return
     */
    public static String decrypt(String password){
        BasicTextEncryptor textEncryptor2 = new BasicTextEncryptor();
        textEncryptor2.setPassword("password");
        return textEncryptor2.decrypt(password);
    }


    public static void main(String[] args) {
        System.out.println(encryption("123456"));
    }
}
