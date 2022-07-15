package com.thodsaphon.decrypt;

import com.thodsaphon.decrypt.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;

@Slf4j
public class DecryptApplication {
    public static final String SECRET = "aWFuZ25vVzpOQU06RU5JTDp0YTpzdTpuaW9K";

    public static void main(String[] args) {
        try {
            String decoded = StringUtils.convertBase64ToString(SECRET);
            log.info("Decoded: {}", decoded);
            log.info("Answers: {}", StringUtils.reverse(decoded));
        } catch (ParseException e) {
            log.error("ParseException: {}", e.getMessage());
        }
    }
}
