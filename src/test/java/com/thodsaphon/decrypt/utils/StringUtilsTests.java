package com.thodsaphon.decrypt.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class StringUtilsTests {
    @Test
    void testDecryptBase64() {
        ParseException parseException =
                Assertions.assertThrows(ParseException.class, () -> StringUtils.convertBase64ToString(null));
        Assertions.assertEquals("base64 is null", parseException.getMessage());

        String result =
                Assertions.assertDoesNotThrow(() -> StringUtils.convertBase64ToString(""));
        Assertions.assertEquals(StringUtils.EMPTY, result);

        result = Assertions.assertDoesNotThrow(() -> StringUtils.convertBase64ToString(" "));
        Assertions.assertEquals(StringUtils.EMPTY, result);

        result = Assertions.assertDoesNotThrow(() -> StringUtils.convertBase64ToString("SGVsbG8gV29ybGQ="));
        Assertions.assertEquals("Hello World", result);
    }

    @Test
    void testReverseString() {
        ParseException parseException =
                Assertions.assertThrows(ParseException.class, () -> StringUtils.reverse(null));
        Assertions.assertEquals("message is null", parseException.getMessage());

        String result =
                Assertions.assertDoesNotThrow(() -> StringUtils.reverse(""));
        Assertions.assertEquals(StringUtils.EMPTY, result);

        result = Assertions.assertDoesNotThrow(() -> StringUtils.reverse(" "));
        Assertions.assertEquals(StringUtils.EMPTY, result);

        result = Assertions.assertDoesNotThrow(() -> StringUtils.reverse("dlroW olleH"));
        Assertions.assertEquals("Hello World", result);
    }
}
