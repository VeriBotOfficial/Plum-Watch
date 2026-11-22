package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* compiled from: CollectController.java */
/* loaded from: classes2.dex */
public class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f13906a = new HashMap();
    private static Object b = new Object();

    private b() {
    }

    public void a() {
        synchronized (b) {
            f13906a.clear();
        }
    }

    /* compiled from: CollectController.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f13907a = new b();

        private a() {
        }
    }

    public static b b() {
        return a.f13907a;
    }

    public static boolean a(String str) {
        if (!d.a(str)) {
            return false;
        }
        synchronized (b) {
            if (!f13906a.containsKey(str)) {
                return true;
            }
            return f13906a.get(str).booleanValue();
        }
    }

    @Override // com.umeng.commonsdk.config.f
    public void a(String str, Boolean bool) {
        if (d.a(str)) {
            synchronized (b) {
                Map<String, Boolean> map = f13906a;
                if (map != null) {
                    map.put(str, bool);
                }
            }
        }
    }
}
