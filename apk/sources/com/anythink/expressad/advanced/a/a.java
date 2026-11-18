package com.anythink.expressad.advanced.a;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f4593a = new HashMap();

    public static void a(String str) {
        f4593a.put(str, Boolean.TRUE);
    }

    public static boolean b(String str) {
        if (f4593a.containsKey(str)) {
            return f4593a.get(str).booleanValue();
        }
        return false;
    }

    public static void c(String str) {
        f4593a.remove(str);
    }

    private static void a() {
        f4593a.clear();
    }
}
