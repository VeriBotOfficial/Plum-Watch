package com.anythink.network.gtm;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* loaded from: classes12.dex */
public class GTMATConst {
    public static final int NETWORK_FIRM_ID = 6;
    public static final String NOTCH_SCREEN_BOTTOM = "notch_screen_bottom";
    public static final String NOTCH_SCREEN_LEFT = "notch_screen_left";
    public static final String NOTCH_SCREEN_RIGHT = "notch_screen_right";
    public static final String NOTCH_SCREEN_TOP = "notch_screen_top";

    /* renamed from: a, reason: collision with root package name */
    static String f5795a;

    public static class DEBUGGER_CONFIG {
        public static final int GTM_INTERSTITIAL_IMAGE = 1;
        public static final int GTM_INTERSTITIAL_VIDEO = 2;
        public static final int GTM_NATIVE_SELF_RENDER = 1;
        public static final int GTM_NATIVE_TEMPLATE = 2;
        public static final int GTM_NETWORK = 6;
    }

    public static class REWARD_EXTRA {
        public static final String REWARD_EXTRA_KEY_REWARD_ALERT_STATUS = "gtm_reward_alert_status";
        public static final String REWARD_EXTRA_KEY_REWARD_AMOUNT = "gtm_reward_amount";
        public static final String REWARD_EXTRA_KEY_REWARD_NAME = "gtm_reward_name";
    }

    public static String getNetworkVersion() {
        String str = f5795a;
        if (str != null) {
            return str;
        }
        try {
            Class<?> cls = Class.forName("com.mbridge.msdk.out.MBConfiguration");
            for (Field field : cls.getFields()) {
                field.setAccessible(true);
                if (field.getType().toString().endsWith("java.lang.String") && Modifier.isStatic(field.getModifiers())) {
                    String obj = field.get(cls).toString();
                    if (obj.startsWith("MAL")) {
                        f5795a = obj;
                        return obj;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        f5795a = "";
        return "";
    }
}
