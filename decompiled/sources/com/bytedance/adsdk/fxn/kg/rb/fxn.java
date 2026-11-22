package com.bytedance.adsdk.fxn.kg.rb;

/* loaded from: classes13.dex */
public class fxn {
    public static boolean fxn(char c) {
        return c == ' ';
    }

    public static boolean gff(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean hm(char c) {
        return '+' == c || '-' == c || '*' == c || '/' == c || '%' == c || '=' == c || '>' == c || '<' == c || '!' == c || '&' == c || '|' == c || '?' == c || ':' == c;
    }

    public static boolean kg(char c) {
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }
}
