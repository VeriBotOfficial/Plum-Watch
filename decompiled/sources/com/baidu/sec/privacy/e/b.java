package com.baidu.sec.privacy.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.baidu.sec.privacy.f.e;

/* compiled from: PrvConnectivityManagerImpl.java */
/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile b f9030a;
    public static Context b;

    public b(Context context) {
        b = context;
    }

    public static b a(Context context) {
        if (f9030a == null) {
            synchronized (b.class) {
                f9030a = new b(context);
            }
        }
        return f9030a;
    }

    public NetworkInfo a() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) b.getSystemService("connectivity");
            if (e.a(b, new String[]{"android.permission.ACCESS_NETWORK_STATE"})) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
            return null;
        }
    }
}
