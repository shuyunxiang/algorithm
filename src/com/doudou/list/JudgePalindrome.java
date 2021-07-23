package com.doudou.list;

public class JudgePalindrome {
    public static void main(String[] args) {
        boolean isPalindrome = MySolution.judgePalindrome("aaappaaa");

        System.out.println(isPalindrome);
    }
}

class MySolution {
    /**
     * 回文字符串判断
     */
    static boolean judgePalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(c);
            }
        }

        int stringNum = stringBuilder.length();
        int left = 0;
        int right = stringNum - 1;
        while (left < right) {
            if (Character.toLowerCase(stringBuilder.charAt(left)) != Character.toLowerCase(stringBuilder.charAt(right))) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }
}