package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* compiled from: NetManager.java */
/* loaded from: classes17.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f11664a;

    public static synchronized ConnectivityManager a() {
        ConnectivityManager connectivityManager;
        synchronized (f0.class) {
            try {
                if (f11664a == null && com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                    f11664a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.m().d().getSystemService("connectivity");
                }
            } catch (Exception e) {
                o0.b("NetManager", e.getMessage());
            }
            connectivityManager = f11664a;
        }
        return connectivityManager;
    }
}
