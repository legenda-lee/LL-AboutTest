package com.legenda.lee.studytest.aboutString;

import cn.hutool.core.util.StrUtil;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-08-11 10:56 上午
 * @description:
 */
public class Test9 {

    public static void main(String[] args) {
        String lo = "43434fda/日 ";
        System.out.println(lo.endsWith("/日"));

        String looo = "56次/日 ";



        String pinlv = StrUtil.subBefore(looo, "次", false);
        System.out.println(pinlv);


        String a = "({})";
        System.out.println(isValid(a));

        // System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("IIV"));
    }


    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Deque<Character> q = new ArrayDeque<>();
        for (char ch : chars) {
            boolean left = ch == '(' || ch == '[' || ch == '{';
            if (left) {
                q.push(ch);
            } else if (q.isEmpty() || !match(q.pop(), ch)) {
                return false;
            }
        }
        return q.isEmpty();
    }

    private static boolean match(char l, char r) {
        return (l == '(' && r == ')') || (l == '{' && r == '}') || (l == '[' && r == ']');
    }

    public static int romanToInt(String s) {
        Map<String, Integer> nums = new HashMap<>();
        nums.put("M", 1000);
        nums.put("CM", 900);
        nums.put("D", 500);
        nums.put("CD", 400);
        nums.put("C", 100);
        nums.put("XC", 90);
        nums.put("L", 50);
        nums.put("XL", 40);
        nums.put("X", 10);
        nums.put("IX", 9);
        nums.put("V", 5);
        nums.put("IV", 4);
        nums.put("I", 1);

        int res = 0;
        for (int i = 0; i < s.length();) {
            if (i + 1 < s.length() && nums.get(s.substring(i, i + 2)) != null) {
                res += nums.get(s.substring(i, i + 2));
                i += 2;
            } else {
                res += nums.get(s.substring(i, i + 1));
                i += 1;
            }
        }
        return res;
    }
}
