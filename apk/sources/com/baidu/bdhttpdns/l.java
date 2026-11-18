package com.baidu.bdhttpdns;

import android.util.Log;

/* JADX INFO: loaded from: classes16.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f7464a = false;

    static void a(String str, Object... objArr) {
        if (f7464a) {
            Log.v("BDHttpDns", String.format(str, objArr));
        }
    }

    static void a(boolean z) {
        f7464a = z;
    }
}
