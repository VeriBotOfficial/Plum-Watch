package com.anythink.network.facebook;

import java.lang.reflect.Field;

/* loaded from: classes12.dex */
public class FacebookATConst {
    public static final int NETWORK_FIRM_ID = 1;

    /* renamed from: a, reason: collision with root package name */
    protected static final String f5764a = "encrypted_cpm";
    static String b;

    public static class DEBUGGER_CONFIG {
        public static final int Facebook_NATIVE_BANNER_SELF_RENDER = 4;
        public static final int Facebook_NATIVE_BANNER_TEMPLATE = 2;
        public static final int Facebook_NATIVE_SELF_RENDER = 1;
        public static final int Facebook_NATIVE_TEMPLATE = 3;
        public static final int Facebook_NETWORK = 1;
    }

    public static String getNetworkVersion() {
        String str = b;
        if (str != null) {
            return str;
        }
        try {
            Field declaredField = com.facebook.ads.BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            String str2 = (String) declaredField.get(null);
            b = str2;
            return str2;
        } catch (Throwable unused) {
            b = "";
            return "";
        }
    }
}
