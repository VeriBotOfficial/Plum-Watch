package com.umeng.crash;

import android.util.Log;

/* compiled from: UCrash */
/* loaded from: classes2.dex */
final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    static boolean f14001a;

    h() {
    }

    @Override // com.umeng.crash.g
    public final void a(String str, String str2) {
        if (f14001a) {
            Log.d(str, str2);
        }
    }

    @Override // com.umeng.crash.g
    public final void b(String str, String str2) {
        if (f14001a) {
            Log.i(str, str2);
        }
    }

    @Override // com.umeng.crash.g
    public final void c(String str, String str2) {
        if (f14001a) {
            Log.w(str, str2);
        }
    }

    @Override // com.umeng.crash.g
    public final void d(String str, String str2) {
        if (f14001a) {
            Log.e(str, str2);
        }
    }

    @Override // com.umeng.crash.g
    public final void a(String str, String str2, Throwable th) {
        if (f14001a) {
            Log.e(str, str2, th);
        }
    }
}
