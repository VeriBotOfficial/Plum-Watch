package com.mbridge.msdk.util;

import com.anythink.core.common.v.q;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.out.MBConfiguration;

/* compiled from: CommonUtils.java */
/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f12329a;
    private static volatile Boolean b;

    public static boolean a() {
        if (f12329a == null) {
            try {
                Boolean valueOf = Boolean.valueOf(Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2);
                f12329a = valueOf;
                return valueOf.booleanValue();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b(q.f4426a, "isChina", e);
                }
            }
        }
        return f12329a != null && f12329a.booleanValue();
    }

    public static boolean b() {
        if (b == null) {
            try {
                Boolean valueOf = Boolean.valueOf(Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1);
                b = valueOf;
                return valueOf.booleanValue();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b(q.f4426a, "isOversea", e);
                }
            }
        }
        return b != null && b.booleanValue();
    }
}
