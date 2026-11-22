package com.qweather.sdk.view;

import com.qweather.sdk.a.a;

/* loaded from: classes17.dex */
public class HeConfig {
    private static String appKey;
    private static String publicId;

    private HeConfig() {
    }

    public static String getPublicId() {
        return publicId;
    }

    public static String getAppKey() {
        return appKey;
    }

    public static void init(String str, String str2) {
        publicId = str;
        appKey = str2;
    }

    public static void switchToDevService() {
        a.f13459a = true;
    }

    public static void switchToBizService() {
        a.f13459a = false;
    }
}
