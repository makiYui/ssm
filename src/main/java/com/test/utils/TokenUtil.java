package com.test.utils;

import java.nio.charset.Charset;
import java.security.SecureRandom;

/**
 * Created by hp on 2018/4/24.
 */
public class TokenUtil {

    public static Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private static final SecureRandom random = new SecureRandom();
    private static final String ALLCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789V";

    public static final String randomString(int length) {
        if (length <= 0)
            throw new IllegalArgumentException("Length must be an integer greater than 0");
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = ALLCHARS.charAt(random.nextInt(ALLCHARS.length()));
        }
        return new String(text);
    }
}
