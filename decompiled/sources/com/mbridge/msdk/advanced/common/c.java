package com.mbridge.msdk.advanced.common;

import java.util.HashMap;
import java.util.Map;

/* compiled from: MBNativeAdvancedWebViewCache.java */
/* loaded from: classes17.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f11257a = new HashMap();

    public static void a(String str, boolean z) {
        f11257a.put(str, Boolean.valueOf(z));
    }

    public static void b(String str) {
        f11257a.remove(str);
    }

    public static boolean a(String str) {
        if (f11257a.containsKey(str)) {
            return f11257a.get(str).booleanValue();
        }
        return false;
    }
}
