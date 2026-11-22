package com.huawei.hms.framework.network.grs.h;

import com.huawei.hms.framework.common.Logger;

/* loaded from: classes14.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10383a = "e";

    public static boolean a(Long l) {
        if (l == null) {
            Logger.v(f10383a, "Method isTimeExpire input param expireTime is null.");
            return true;
        }
        try {
        } catch (NumberFormatException unused) {
            Logger.v(f10383a, "isSpExpire spValue NumberFormatException.");
        }
        if (l.longValue() - System.currentTimeMillis() >= 0) {
            Logger.i(f10383a, "isSpExpire false.");
            return false;
        }
        Logger.i(f10383a, "isSpExpire true.");
        return true;
    }

    public static boolean a(Long l, long j) {
        if (l == null) {
            Logger.v(f10383a, "Method isTimeWillExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l.longValue() - (System.currentTimeMillis() + j) >= 0) {
                Logger.v(f10383a, "isSpExpire false.");
                return false;
            }
        } catch (NumberFormatException unused) {
            Logger.v(f10383a, "isSpExpire spValue NumberFormatException.");
        }
        return true;
    }
}
