package com.wakeup.common.utils;

/* loaded from: classes2.dex */
public class WeatherUtils {
    public static Integer phraseStrToCode(String phrase) {
        if (phrase.contains("雨")) {
            return 3;
        }
        if (phrase.contains("雪")) {
            return 2;
        }
        if (phrase.contains("晴")) {
            return 1;
        }
        if (phrase.contains("云")) {
            return 0;
        }
        if (phrase.contains("阴")) {
            return 4;
        }
        if (phrase.contains("沙") || phrase.contains("尘")) {
            return 5;
        }
        if (phrase.contains("风")) {
            return 6;
        }
        if (phrase.contains("雾") || phrase.contains("霾")) {
            return 7;
        }
        return 1;
    }
}
