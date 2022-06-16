package com.company;

public class StringCompare {
    static String s1 = "In 2022 I'll be the reach QA";
    static int len1 = s1.length();
    static String s2 = "In 2025 I'll be the best teamlead)";
    static int len2 = s2.length();

public static void main (String [] arg) {
            System.out.println(comparester(s1,s2));
        }

    private static boolean comparester(String s1, String s2) {
        if (len1 > len2) {
            return true;

        } else {
            return false;
        }
    }
}

