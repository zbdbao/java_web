package com.meme;

import com.meme.utils.EncryptUtil;

/**
 * Created by zhangb on 30/11/2015.
 */
public class EncryptTest {
    public static void main(String[] args){
        String password = "123456";
        String encryptedStr = "";
        encryptedStr = EncryptUtil.encrypt(password);

        String wrongPassword = "123455";
        System.out.println(wrongPassword+" - "+encryptedStr+" - "+EncryptUtil.match(wrongPassword, encryptedStr));

        System.out.println(password+" - "+encryptedStr+" - "+EncryptUtil.match(password, encryptedStr));
    }
}
