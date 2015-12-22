package com.meme.utils;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
/**
 * Created by zhangb on 30/11/2015.
 */
public class EncryptUtil {

    private static final String SITE_WIDE_SECRET = "05b78338cb2c275e471533b05eff31979f5e4df9695ab72eb55cfe3abd92a7d581f250fc9d37d801";
    private static final PasswordEncoder encoder = new StandardPasswordEncoder(
            SITE_WIDE_SECRET);

    public static String encrypt(String rawPassword) {
        return encoder.encode(rawPassword);
    }

    public static boolean match(String rawPassword, String password) {
        return encoder.matches(rawPassword, password);
    }
}