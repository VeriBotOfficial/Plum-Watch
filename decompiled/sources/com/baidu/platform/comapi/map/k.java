package com.baidu.platform.comapi.map;

import android.util.Log;

/* compiled from: MapTrace.java */
/* loaded from: classes13.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    static boolean f8654a = false;

    static void a(String str, String str2) {
        if (f8654a) {
            Log.d("MapTrace-" + str, "thread:" + Thread.currentThread().getName() + ":" + Thread.currentThread().getId() + "," + str2);
        }
    }
}
