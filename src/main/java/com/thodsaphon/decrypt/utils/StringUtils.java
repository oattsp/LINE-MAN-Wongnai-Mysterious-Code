package com.thodsaphon.decrypt.utils;

import java.text.ParseException;
import java.util.Base64;

public class StringUtils {
    public static final String EMPTY = "";

    public static String convertBase64ToString(String base64) throws ParseException {
        if (base64 == null) {
            throw new ParseException("base64 is null", -1);
        }

        if (base64.isBlank()) {
            return EMPTY;
        }

        byte[] decode = Base64.getDecoder().decode(base64);
        return new String(decode);
    }

    public static String reverse(String message) throws ParseException {
        if (message == null) {
            throw new ParseException("message is null", -1);
        }

        if (message.isBlank()) {
            return StringUtils.EMPTY;
        }

        return new StringBuilder(message).reverse().toString();
    }
}
