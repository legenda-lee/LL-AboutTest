package com.legenda.lee.studytest.aboutUnicode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-10-12 6:48 下午
 * @description:
 */
public class TestTrans {

    public static void main(String[] args) {
        String demo = "{\"projectname\": \"p0001-\\u836f\\u54c1\\u6210\\u5206\\u51b2\\u7a81\\u6821\\u9a8c\\u4e8b\\u4ef6\", \"operatetype\": \"\\u67e5\\u770b\", \"comment\": \"\\u6211\\u81ea\\u5df1\\u7533\\u8bf7\\u8bd5\\u8bd5\\u770b\"}";

        String result = decodeUnicode(demo);
        // String result = unicodeToCn(demo);
        System.out.println(result);
    }

    public static String decodeUnicode(final String dataStr) {
        int start = 0;
        int end = 0;
        final StringBuffer buffer = new StringBuffer();
        while (start > -1) {
            end = dataStr.indexOf("\\u", start + 2);
            String charStr = "";
            if (end == -1) {
                charStr = dataStr.substring(start + 2, dataStr.length());
            } else {
                charStr = dataStr.substring(start + 2, end);
            }
            char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。
            buffer.append(new Character(letter).toString());
            start = end;
        }
        return buffer.toString();
    }

    // private static String unicodeToCn(String unicode) {
    //     String unicodeCompile = "(?&lt;=\\\\u).{4}?";
    //     String a;
    //     Matcher matcher = Pattern.compile(unicodeCompile).matcher(unicode);
    //     for (; matcher.find(); ) {
    //         a = matcher.group();
    //         unicode = unicode.replace("\\u" + a, String.valueOf((char) Integer.valueOf(a, 16).intValue()));
    //     }
    //     return unicode;
    // }
}
