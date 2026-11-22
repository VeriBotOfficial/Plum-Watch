package com.baidu.lbsapi.auth;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes13.dex */
class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f7491a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ e e;

    f(e eVar, String str, int i, String str2, String str3) {
        this.e = eVar;
        this.f7491a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        HashMap hashMap;
        b.a("postWithHttps start Thread id = " + String.valueOf(Thread.currentThread().getId()));
        context = this.e.f7490a;
        i iVar = new i(context);
        hashMap = this.e.b;
        this.e.a(iVar.a(hashMap, this.f7491a, this.b, this.c, this.d));
    }
}
