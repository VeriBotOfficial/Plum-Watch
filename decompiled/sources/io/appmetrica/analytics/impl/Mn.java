package io.appmetrica.analytics.impl;

import com.xiaomi.mipush.sdk.Constants;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class Mn {
    public static boolean a(String str) {
        UUID uuid;
        if (str == null || str.length() != 32) {
            return false;
        }
        try {
            uuid = UUID.fromString(b(str));
        } catch (Throwable unused) {
            uuid = null;
        }
        return uuid != null;
    }

    public static String b(String str) {
        return str.substring(0, 8) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str.substring(8, 12) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str.substring(12, 16) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str.substring(16, 20) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str.substring(20, 32);
    }
}
