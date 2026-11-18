package com.baidu.platform.comapi.map;

import android.util.Log;

/* JADX INFO: compiled from: MapTrace.java */
/* JADX INFO: loaded from: classes15.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f8654a = false;

    static void a(String str, String str2) {
        if (f8654a) {
            Log.d("MapTrace-" + str, "thread:" + Thread.currentThread().getName() + ":" + Thread.currentThread().getId() + "," + str2);
        }
    }
}
